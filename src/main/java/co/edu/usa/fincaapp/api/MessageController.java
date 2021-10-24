package co.edu.usa.fincaapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usa.fincaapp.entidades.Message;
import co.edu.usa.fincaapp.servicios.MessageServicio;


@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*")

public class MessageController {

@Autowired private MessageServicio MessageServicio;

@GetMapping("/all")
public List<Message> getTodosMensajes() {
    return MessageServicio.getMessage();
}

@PostMapping("/save")
public Message guardar(@RequestBody Message Message){
    Message m = MessageServicio.guardarMessage(Message);
    return m;
}


}
