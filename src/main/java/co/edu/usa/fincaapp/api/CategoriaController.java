package co.edu.usa.fincaapp.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.usa.fincaapp.entidades.Category;
import co.edu.usa.fincaapp.servicios.CategoriaServicio;


@RestController
@RequestMapping("/api/Category")
@CrossOrigin(origins = "*")

public class CategoriaController {
    @Autowired private CategoriaServicio CategoriaServicio;

    @GetMapping("/all")
    public List<Category> getTodasCategoria(){
        return CategoriaServicio.getCategoria();
    }

    @PostMapping("/save")
    public Category guardar(@RequestBody Category category){
        Category g = CategoriaServicio.guardarCategoria(category);
        return g;
    }


}
