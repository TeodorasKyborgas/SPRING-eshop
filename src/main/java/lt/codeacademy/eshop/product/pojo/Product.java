package lt.codeacademy.eshop.product.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private UUID productId;
    private String name;
    private double price;
    private int amount;
}
