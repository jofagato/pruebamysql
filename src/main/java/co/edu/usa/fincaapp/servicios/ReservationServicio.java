package co.edu.usa.fincaapp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.usa.fincaapp.entidades.Reservations;
import co.edu.usa.fincaapp.respositorios.ReservationsRepository;

@Service
public class ReservationServicio {
    @Autowired

    private ReservationsRepository ReservationsRepository;
    
    public List<Reservations> getReservations(){
        return ReservationsRepository.getTodosReservations();
    }
    public Reservations guardarReservations(Reservations Reservations){
        return ReservationsRepository.guardar(Reservations);
    }

}
