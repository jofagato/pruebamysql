package co.edu.usa.fincaapp.respositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.usa.fincaapp.entidades.Farm;
@Repository
public class FarmRepository {
 
    @Autowired 
    private FarmCrudRepository fincaRepoitorio;

    public Optional<Farm> getFincaPorId(Long idFinca){
         return  fincaRepoitorio.findById(idFinca);
    }
    public List<Farm> getTodasFinca(){
        return (List<Farm>)fincaRepoitorio.findAll();
    }
    public Farm guardar(Farm f){
        return fincaRepoitorio.save(f);
    }
    public void borrar(Farm f){
        fincaRepoitorio.delete(f);
    }
}
