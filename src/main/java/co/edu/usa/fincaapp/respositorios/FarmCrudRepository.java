package co.edu.usa.fincaapp.respositorios;

import org.springframework.data.repository.CrudRepository;

import co.edu.usa.fincaapp.entidades.Farm;

public interface FarmCrudRepository extends CrudRepository<Farm,Long>{
    
}
