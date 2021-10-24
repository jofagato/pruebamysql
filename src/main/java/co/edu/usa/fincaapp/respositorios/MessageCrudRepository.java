package co.edu.usa.fincaapp.respositorios;

import org.springframework.data.repository.CrudRepository;

import co.edu.usa.fincaapp.entidades.Message;

public interface MessageCrudRepository extends CrudRepository<Message,Long>{
    
}
