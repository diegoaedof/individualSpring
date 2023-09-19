package cl.awakelab.miprimerspring.restcontroller;

import cl.awakelab.miprimerspring.entity.Curso;
import cl.awakelab.miprimerspring.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cursos")
public class CursoRestController {
    @Autowired
    ICursoService objCursoService;

    @PostMapping
    public Curso crearCurso(@RequestBody Curso cursoACrear){
        return objCursoService.crearCurso(cursoACrear);
    }

    @GetMapping
    public List<Curso> listarCursos(){
        return objCursoService.listarCursos();
    }

    @GetMapping("/{id}")
    public Curso buscarCursoId(@PathVariable int id){
        return objCursoService.buscarCursoId(id);
    }

    @PutMapping
    public Curso actualizarCurso(@RequestBody Curso cursoNuevo){
        return objCursoService.actualizarCurso(cursoNuevo);
    }

    @DeleteMapping("/{id}")
    public void eliminarCurso(@PathVariable int id){
        objCursoService.eliminarCurso(id);
    }
}
