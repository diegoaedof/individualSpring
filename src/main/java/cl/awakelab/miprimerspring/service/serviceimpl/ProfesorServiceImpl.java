package cl.awakelab.miprimerspring.service.serviceimpl;

import cl.awakelab.miprimerspring.entity.Profesor;
import cl.awakelab.miprimerspring.repository.IProfesorRepository;
import cl.awakelab.miprimerspring.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("profesorServiceImpl")
public class ProfesorServiceImpl implements IProfesorService{
    @Autowired
    IProfesorRepository objProfesorRepo;

    @Override
    public Profesor crearProfesor(Profesor profesorACrear) {
        Profesor nuevoProfesor = new Profesor();
        nuevoProfesor = objProfesorRepo.save(profesorACrear);
        return nuevoProfesor;
    }

    @Override
    public List<Profesor> listarProfesores() {
        List<Profesor> listadoProfesores = new ArrayList<>();
        listadoProfesores = objProfesorRepo.findAll();
        return listadoProfesores;
    }

    @Override
    public Profesor buscarProfesorId(int id) {return objProfesorRepo.findById(id).orElse(null);}

    @Override
    public Profesor actualizarProfesor(Profesor profesorNuevo) {
        Profesor profesorActualizado = objProfesorRepo.findById(profesorNuevo.getId()).orElse(null);

        profesorActualizado.setNombres(profesorNuevo.getNombres());
        profesorActualizado.setApellido1(profesorNuevo.getApellido1());
        profesorActualizado.setApellido2(profesorNuevo.getApellido2());
        profesorActualizado.setListaCursos(profesorNuevo.getListaCursos());
        return profesorActualizado;
    }

    @Override
    public void eliminarProfesor(int id) {
        objProfesorRepo.deleteById(id);
    }
}
