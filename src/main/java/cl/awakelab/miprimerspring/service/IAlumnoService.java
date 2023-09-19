package cl.awakelab.miprimerspring.service;

import cl.awakelab.miprimerspring.entity.Alumno;

import java.util.List;

public interface IAlumnoService {
    public Alumno crearAlumno(Alumno alumnoACrear);
    public List<Alumno> listarAlumno();
    public Alumno buscarAlumnoId(int id);
    public Alumno actualizarAlumno(Alumno alumnoNuevo);
    public void eliminarAlumno(int id);
}
