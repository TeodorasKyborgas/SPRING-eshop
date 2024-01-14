package lt.codeacademy.eshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstControler {

    @GetMapping("/hello/{name}")
    public String sayHelloToCustomer(@PathVariable String name, @RequestParam String surename){
        return "hello";
    }
}
