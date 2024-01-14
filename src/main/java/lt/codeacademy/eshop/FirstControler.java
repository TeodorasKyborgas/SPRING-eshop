package lt.codeacademy.eshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstControler {

    @GetMapping("/hello")
    public String sayHelloToCustomer(){
        return "hello";
    }
}
