package pe.edu.cibertec.eco_ropa.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.eco_ropa.entidad.Usuario;
import pe.edu.cibertec.eco_ropa.repositorio.UsuarioRepository;
import pe.edu.cibertec.eco_ropa.serviceImp.IMP.ICRUDImp;

@Service
public class UsuarioService extends ICRUDImp<Usuario, Long> {

    @Autowired
    private UsuarioRepository repo;

    @Override
    public JpaRepository<Usuario, Long> getJpaRepository() {
        return repo;
    }
}
