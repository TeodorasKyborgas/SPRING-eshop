package lt.codeacademy.eshop.product;


import lombok.*;

import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Product {
    private UUID uuid;
    private String name;
    private double price;
    private int amount;
}
