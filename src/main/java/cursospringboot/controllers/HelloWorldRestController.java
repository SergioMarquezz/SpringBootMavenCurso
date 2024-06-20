package cursospringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    //@GetMapping("/hello")
    @GetMapping({"/hello", "/hola"})
    public String helloWorld(){
        return "Hola Mundo";
    }
}
