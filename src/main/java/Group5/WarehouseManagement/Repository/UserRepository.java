package Group5.WarehouseManagement.Repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Group5.WarehouseManagement.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    boolean existsByUsername(String username);

    long countByRole(String role);

    boolean existsByBranch_BranchId(Long branchId);
    @Query("""
            SELECT u FROM User u LEFT JOIN u.branch b
            WHERE (LOWER(u.username) LIKE LOWER(CONCAT('%', :keyword, '%'))
                   OR LOWER(u.fullName) LIKE LOWER(CONCAT('%', :keyword, '%')))
              AND (:role IS NULL OR u.role = :role)
              AND (:branchId IS NULL OR b.branchId = :branchId)
            """)
    Page<User> search(@Param("keyword") String keyword,
                      @Param("role") String role,
                      @Param("branchId") Long branchId,
                      Pageable pageable);
}
