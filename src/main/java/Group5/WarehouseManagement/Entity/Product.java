package Group5.WarehouseManagement.Entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "sku", unique = true, length = 50)
    private String sku;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "unit", length = 30)
    private String unit; // Cái, Hộp, Thùng, Kg...

    @Column(name = "import_price", precision = 15, scale = 2)
    private BigDecimal importPrice;

    @Column(name = "selling_price", precision = 15, scale = 2)
    private BigDecimal sellingPrice;

    @Column(name = "min_stock")
    private Integer minStock;

    @Column(name = "max_stock")
    private Integer maxStock;

    @Column(name = "status", length = 30)
    @Builder.Default
    private String status = "ACTIVE";
}