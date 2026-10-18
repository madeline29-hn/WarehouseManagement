package Group5.WarehouseManagement.Repository;



import Group5.WarehouseManagement.Entity.ImportTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImportTicketRepository extends JpaRepository<ImportTicket, Long> {
}