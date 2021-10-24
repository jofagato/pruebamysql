package co.edu.usa.fincaapp.respositorios;

import org.springframework.data.repository.CrudRepository;


import co.edu.usa.fincaapp.entidades.Reservations;

public interface ReservationsCrudRepository extends CrudRepository<Reservations,Long>{
    
}
