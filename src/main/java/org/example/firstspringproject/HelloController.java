package org.example.firstspringproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getHello(){
        return "Hello World";
    }
    @GetMapping("/")
    public String getHome(){
        return "Welcome Home ...........";
    }
    @GetMapping("/test")
    public String testing(){
        return "Sanket Singh";
    }
}
