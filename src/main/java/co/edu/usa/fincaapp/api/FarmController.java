package co.edu.usa.fincaapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.usa.fincaapp.entidades.Farm;
import co.edu.usa.fincaapp.servicios.FarmServicio;

@RestController
@RequestMapping("/api/Farm")
@CrossOrigin(origins = "*")

public class FarmController {
    @Autowired private FarmServicio FarmServicio;

    @GetMapping("/all")
    public List<Farm> getTodasFincas(){
        return FarmServicio.getFincas();
    }

    @PostMapping("/save")
    public Farm guardar(@RequestBody Farm Farm){
        Farm f = FarmServicio.guardarFinca(Farm);
        return f;
    }
    
}
