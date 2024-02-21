package lt.codeacademy.eshop.cart.calculator;

import lt.codeacademy.eshop.cart.dto.CartItemDto;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CartItemCalculator {

    public static BigDecimal calculateTotal(final CartItemDto cartItemDto) {
        return cartItemDto.getProductDto().getPrice().multiply(BigDecimal.valueOf(cartItemDto.getQuantity()));
    }
}