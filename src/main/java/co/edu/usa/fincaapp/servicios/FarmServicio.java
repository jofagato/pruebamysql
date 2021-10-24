package co.edu.usa.fincaapp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usa.fincaapp.entidades.Farm;
import co.edu.usa.fincaapp.respositorios.FarmRepository;

@Service
public class FarmServicio {
    @Autowired
    private FarmRepository fincaRepository;
    
    public List<Farm> getFincas(){
        return fincaRepository.getTodasFinca();
    }
    public Farm guardarFinca(Farm finca){
        return fincaRepository.guardar(finca);
    }
}
