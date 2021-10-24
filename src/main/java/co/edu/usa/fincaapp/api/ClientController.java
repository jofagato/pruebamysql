package co.edu.usa.fincaapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usa.fincaapp.entidades.Client;
import co.edu.usa.fincaapp.servicios.ClienteServicio;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins = "*")
public class ClientController {
    @Autowired private ClienteServicio ClienteServicio;

    @GetMapping("/all")
    public List<Client> getTodosClientes(){
        return ClienteServicio.obtenerTodoClientes();
    }

    @PostMapping("/save")
    public Client guardar(@RequestBody Client Client){
        Client c = ClienteServicio.guardar(Client);
        return c;
    }
}
