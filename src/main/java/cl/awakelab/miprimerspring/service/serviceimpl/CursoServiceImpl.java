package cl.awakelab.miprimerspring.service.serviceimpl;

import cl.awakelab.miprimerspring.entity.Curso;
import cl.awakelab.miprimerspring.repository.ICursoRepository;
import cl.awakelab.miprimerspring.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cursoServiceImpl")
public class CursoServiceImpl implements ICursoService {
    @Autowired
    ICursoRepository objCursoRepo;

    @Override
    public Curso crearCurso(Curso cursoACrear) {
        return objCursoRepo.save(cursoACrear);
    }

    @Override
    public List<Curso> listarCursos() {
        return objCursoRepo.findAll();
    }

    @Override
    public Curso buscarCursoId(int id) {
        return objCursoRepo.findById(id).orElse(null);
    }

    @Override
    public Curso actualizarCurso(Curso cursoNuevo) {
        Curso cursoActualizado = this.buscarCursoId(cursoNuevo.getId());
        cursoActualizado.setNombreCurso(cursoNuevo.getNombreCurso());
        cursoActualizado.setListaAlumnos(cursoNuevo.getListaAlumnos());
        cursoActualizado.setListaProfesores(cursoNuevo.getListaProfesores());
        return cursoActualizado;
    }

    @Override
    public void eliminarCurso(int id) {
        objCursoRepo.deleteById(id);
    }
}
