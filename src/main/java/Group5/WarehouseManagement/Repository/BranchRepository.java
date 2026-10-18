package Group5.WarehouseManagement.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Group5.WarehouseManagement.Entity.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {

    boolean existsByBranchNameIgnoreCase(String branchName);

    boolean existsByBranchNameIgnoreCaseAndBranchIdNot(String branchName, Long branchId);

    Page<Branch> findByBranchNameContainingIgnoreCase(String keyword, Pageable pageable);

    List<Branch> findByIsActiveTrueOrderByBranchNameAsc();
}
