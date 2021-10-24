package co.edu.usa.fincaapp.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usa.fincaapp.entidades.Category;
import co.edu.usa.fincaapp.respositorios.CategoriaRepositorio;

@Service
public class CategoriaServicio {
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    public List<Category> getCategoria(){
        return categoriaRepositorio.getTodasCategoria();
    }
    public Category guardarCategoria(Category category){
        return categoriaRepositorio.guardar(category);
    }
}
