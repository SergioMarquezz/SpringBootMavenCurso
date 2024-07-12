package cursospringboot.controllers;

import cursospringboot.model.Clientes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ClientesRestController {

    private List<Clientes> customers = new ArrayList<>(Arrays.asList(

            new Clientes(123,"Sergio Alberto","serch123", "checo123"),
            new Clientes(321,"Alberto Marquez","beto321", "321Beto"),
            new Clientes(654,"Mario Hernandez","bros654", "marioB654"),
            new Clientes(789,"Diana","dianita987", "789Diana")
    ));

    @GetMapping("clientes")
    public List<Clientes> getClientes(){
        return customers;
    }

    @GetMapping("clientes/{username}")
    public Clientes getCliente(@PathVariable String username){

        for(Clientes usuario: customers){
            if (usuario.getUsuario().equalsIgnoreCase(username)){
                return usuario;
            }
        }

        return null;
    }


}
