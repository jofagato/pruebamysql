package co.edu.usa.fincaapp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.usa.fincaapp.entidades.Message;
import co.edu.usa.fincaapp.respositorios.MessageRepository;

@Service
public class MessageServicio {
    @Autowired

    private MessageRepository messageRepository;
    
    public List<Message> getMessage(){
        return messageRepository.getTodosMensajes();
    }
    public Message guardarMessage(Message message){
        return messageRepository.guardar(message);
    }
}
