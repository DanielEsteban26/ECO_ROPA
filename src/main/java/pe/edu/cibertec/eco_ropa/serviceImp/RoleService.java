package pe.edu.cibertec.eco_ropa.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.eco_ropa.entidad.Role;
import pe.edu.cibertec.eco_ropa.repositorio.RoleRepository;
import pe.edu.cibertec.eco_ropa.serviceImp.IMP.ICRUDImp;

@Service
public class RoleService extends ICRUDImp<Role, Long> {

    @Autowired
    private RoleRepository repo;

    @Override
    public JpaRepository<Role, Long> getJpaRepository() {
        return repo;
    }
}
