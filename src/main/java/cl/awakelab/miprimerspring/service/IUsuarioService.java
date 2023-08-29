package cl.awakelab.miprimerspring.service;

import cl.awakelab.miprimerspring.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    public Usuario crearUsuario(Usuario usuarioACrear);
    public Usuario actualizarUsuario(int id);
    public List<Usuario> listarUsuario();
    public void eliminarUsuario(int id);
    public Usuario listarUsuarioId(int id);
}
