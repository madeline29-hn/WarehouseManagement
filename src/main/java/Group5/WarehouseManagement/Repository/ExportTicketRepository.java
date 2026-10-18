package Group5.WarehouseManagement.Repository;


import Group5.WarehouseManagement.Entity.ExportTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExportTicketRepository extends JpaRepository<ExportTicket, Long> {

}
