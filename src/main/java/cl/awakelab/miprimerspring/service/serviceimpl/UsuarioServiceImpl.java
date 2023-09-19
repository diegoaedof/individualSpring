package cl.awakelab.miprimerspring.service.serviceimpl;

import cl.awakelab.miprimerspring.entity.Usuario;
import cl.awakelab.miprimerspring.repository.IUsuarioRepository;
import cl.awakelab.miprimerspring.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("usuarioServiceImpl")
public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    IUsuarioRepository objUsuarioRepo;


    @Override
    public Usuario crearUsuario(Usuario usuarioACrear) { return objUsuarioRepo.save(usuarioACrear); }
    @Override
    public List<Usuario> listarUsuario() { return objUsuarioRepo.findAll(); }
    @Override
    public Usuario buscarUsuarioId(int id) {return objUsuarioRepo.findById(id).orElse(null);}
    @Override
    public Usuario actualizarUsuario(Usuario usuarioNuevo) {
        Usuario usuarioActualizado = this.buscarUsuarioId(usuarioNuevo.getId());

        usuarioActualizado.setNombreUsuario(usuarioNuevo.getNombreUsuario());
        usuarioActualizado.setContrasena(usuarioNuevo.getContrasena());
        usuarioActualizado.setRol(usuarioNuevo.getRol());
        return usuarioActualizado;
    }

    @Override
    public void eliminarUsuario(int id) {
        objUsuarioRepo.deleteById(id);
    }
}
