package lt.codeacademy.eshop;


import lt.codeacademy.eshop.product.Product;
import lt.codeacademy.eshop.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FirstControler {

    private ProductService productService;

    @Autowired
    public FirstControler(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products/create")
    public String sayHelloToCustomer(Model model){
        model.addAttribute("product", new Product());
        return "product";
    }
    @PostMapping("/products/create")
    public String crateAProduct(Product product){
        return "hello";
    }
}
