// ExportTicket.java
package Group5.WarehouseManagement.Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "export_tickets")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ExportTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receipt_id")
    private Long receiptId;

    @Column(name = "receipt_date")
    private LocalDateTime receiptDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id")
    private User employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "branch_id", nullable = false)
    private Branch branch; 

    @Column(name = "export_type", length = 50)
    private String exportType; // SALE, RETURN_SUPPLIER, DISPOSAL

    @Column(name = "status", length = 50)
    @Builder.Default
    private String status = "PENDING"; // PENDING, COMPLETED, CANCELLED

    @Column(name = "notes", columnDefinition = "TEXT")
    private String notes;

    @OneToMany(mappedBy = "exportTicket", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<ExportTicketDetail> details = new ArrayList<>();
}