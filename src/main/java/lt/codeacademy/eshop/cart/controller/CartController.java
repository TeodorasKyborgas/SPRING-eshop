package lt.codeacademy.eshop.cart.controller;


import lombok.RequiredArgsConstructor;
import lt.codeacademy.eshop.cart.dto.CartDto;
import lt.codeacademy.eshop.cart.service.CartService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.UUID;

@Controller
@RequestMapping("/cart")
@SessionAttributes("cartSession")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @ModelAttribute("cartSession")
    public CartDto createDefaultCartSession() {
        return new CartDto();
    }

    @GetMapping
    public String openCart() {
        return "/cart/cart";
    }

    @PostMapping("/{productId}")
    public String addToCart(@PathVariable UUID productId,
                            @ModelAttribute("cartSession") CartDto cart) {
        cartService.addProductToCartByProductId(productId, cart);

        return "redirect:/products";
    }
    @PostMapping
    public String order(SessionStatus sessionStatus) {
        //TODO: save into DB or do other things with cart data

        sessionStatus.setComplete();

        return "redirect:/products";
    }

}
