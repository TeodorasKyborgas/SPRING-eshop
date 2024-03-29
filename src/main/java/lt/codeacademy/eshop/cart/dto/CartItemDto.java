package lt.codeacademy.eshop.cart.dto;

import lombok.Builder;
import lombok.Getter;
import lt.codeacademy.eshop.cart.calculator.CartItemCalculator;
import lt.codeacademy.eshop.product.dto.ProductDto;

import java.math.BigDecimal;

@Builder
@Getter
public class CartItemDto {

    private final ProductDto productDto;
    private int quantity;

    public void incrementQuantity() {
        quantity++;
    }

    public BigDecimal getTotalItemPrice() {
        return CartItemCalculator.calculateTotal(this);
    }
}
