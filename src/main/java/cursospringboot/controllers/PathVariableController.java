package cursospringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @GetMapping("/saludo/{nombre}")
    public String saludar(@PathVariable String nombre){

        return "Hola " +nombre;
    }
}
