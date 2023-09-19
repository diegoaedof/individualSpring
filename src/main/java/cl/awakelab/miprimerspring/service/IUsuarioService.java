package cl.awakelab.miprimerspring.service;

import cl.awakelab.miprimerspring.entity.Usuario;

import java.util.List;

public interface IUsuarioService {
    public Usuario crearUsuario(Usuario usuarioACrear);
    public List<Usuario> listarUsuario();
    public Usuario buscarUsuarioId(int id);
    public Usuario actualizarUsuario(Usuario usuarioNuevo);
    public void eliminarUsuario(int id);

}
