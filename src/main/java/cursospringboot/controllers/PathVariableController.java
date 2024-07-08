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

    @GetMapping("validar-palindromo/{palabra}")
    public String palindromo(@PathVariable String palabra){

        if(isPalindromo(palabra)){
            return "La palabra " +palabra+ " es un palindromo";
        }
        else{
            return "La palabra " +palabra+ " NO es un palindromo";
        }
    }

    private boolean isPalindromo(String palabra){

        int longitud = palabra.length();

        for(int i = 0; i < longitud / 2; i++){

            if(palabra.charAt(i) != palabra.charAt(longitud - i - 1)){
                return false;
            }
        }
        return true;
    }

    public void hola(){

    }
}
