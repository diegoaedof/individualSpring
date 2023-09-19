package cl.awakelab.miprimerspring.restcontroller;

import cl.awakelab.miprimerspring.entity.Alumno;
import cl.awakelab.miprimerspring.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/alumno")
public class AlumnoRestController {
    @Autowired
    IAlumnoService objAlumnoService;

    @PostMapping
    public Alumno crearAlumno(@RequestBody Alumno alumnoACrear){
        return objAlumnoService.crearAlumno(alumnoACrear);
    }

    @GetMapping
    public List<Alumno> listarAlumnos(){
        return objAlumnoService.listarAlumno();
    }

    @GetMapping("/{id}")
    public Alumno buscarAlumnoId(@PathVariable int id){
        return objAlumnoService.buscarAlumnoId(id);
    }

    @PutMapping
    public Alumno actualizarAlumno(@RequestBody Alumno alumnoNuevo){
        return objAlumnoService.actualizarAlumno(alumnoNuevo);
    }

    @DeleteMapping("/{id}")
    public void eliminarAlumno(@PathVariable int id){
        objAlumnoService.eliminarAlumno(id);
    }
}
