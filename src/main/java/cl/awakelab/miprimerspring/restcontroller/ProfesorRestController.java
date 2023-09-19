package cl.awakelab.miprimerspring.restcontroller;

import cl.awakelab.miprimerspring.entity.Profesor;
import cl.awakelab.miprimerspring.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/profesor")
public class ProfesorRestController {
    @Autowired
    IProfesorService objProfesorService;

    @PostMapping
    public Profesor crearProfesor(@RequestBody Profesor profesor){
        return objProfesorService.crearProfesor(profesor);
    }

    @GetMapping
    public List<Profesor> listarProfesor(){
        return objProfesorService.listarProfesores();
    }

    @GetMapping("/{id}")
    public Profesor buscarProfesorId(@PathVariable int id){
        return objProfesorService.buscarProfesorId(id);
    }

    @PutMapping
    public Profesor actualizarProfesor(@RequestBody Profesor profesor){
        return objProfesorService.actualizarProfesor(profesor);
    }

    @DeleteMapping("/{id}")
    public void eliminarProfesor(@PathVariable int id){ objProfesorService.eliminarProfesor(id);}
}
