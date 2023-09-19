package cl.awakelab.miprimerspring.service.serviceimpl;

import cl.awakelab.miprimerspring.entity.Alumno;
import cl.awakelab.miprimerspring.repository.IAlumnoRepository;
import cl.awakelab.miprimerspring.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("alumnoServiceImpl")
public class AlumnoServiceImpl implements IAlumnoService {
    @Autowired
    IAlumnoRepository objAlumnoRepo;

    @Override
    public Alumno crearAlumno(Alumno alumnoACrear) {
        return objAlumnoRepo.save(alumnoACrear);
    }

    @Override
    public List<Alumno> listarAlumno() {
        return objAlumnoRepo.findAll();
    }

    @Override
    public Alumno buscarAlumnoId(int id) {
        return objAlumnoRepo.findById(id).orElse(null);
    }

    @Override
    public Alumno actualizarAlumno(Alumno alumnoNuevo) {
        Alumno alumnoActualizado = this.buscarAlumnoId(alumnoNuevo.getId());
        alumnoActualizado.setNombres(alumnoNuevo.getNombres());
        alumnoActualizado.setApellido1(alumnoNuevo.getApellido1());
        alumnoActualizado.setApellido2(alumnoNuevo.getApellido2());
        alumnoActualizado.setCursoAsignado(alumnoNuevo.getCursoAsignado());
        return alumnoActualizado;
    }

    @Override
    public void eliminarAlumno(int id) {
        objAlumnoRepo.deleteById(id);
    }
}
