package co.edu.usa.fincaapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.usa.fincaapp.entidades.Reservations;
import co.edu.usa.fincaapp.servicios.ReservationServicio;


@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*")

public class ReservationsController {
    @Autowired private ReservationServicio ReservationsServicio;

    @GetMapping("/all")
    public List<Reservations> getTodosReservations(){
        return ReservationsServicio.getReservations();
    }

    @PostMapping("/save")
    public Reservations guardar(@RequestBody Reservations Reservations){
        Reservations r = ReservationsServicio.guardarReservations(Reservations);
        return r;
    }


}
