package cl.awakelab.miprimerspring.service;

import cl.awakelab.miprimerspring.entity.Profesor;

import java.util.List;

public interface IProfesorService {
    public Profesor crearProfesor(Profesor profesorACrear);
    public List<Profesor> listarProfesores();
    public Profesor buscarProfesorId(int id);
    public Profesor actualizarProfesor(Profesor profesorNuevo);
    public void eliminarProfesor(int id);
}
