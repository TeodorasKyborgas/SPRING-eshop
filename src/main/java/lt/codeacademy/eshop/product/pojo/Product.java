package lt.codeacademy.eshop.product.pojo;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private UUID productId;
    private String name;
    private BigDecimal price;
    private int amount;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private Set<ProductCategory> productCategories = new HashSet<>();
}
