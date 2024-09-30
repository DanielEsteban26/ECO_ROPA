package pe.edu.cibertec.eco_ropa.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.eco_ropa.entidad.Categoria;
import pe.edu.cibertec.eco_ropa.repositorio.CategoriaRepository;
import pe.edu.cibertec.eco_ropa.serviceImp.IMP.ICRUDImp;

@Service
public class CategoriaService extends ICRUDImp<Categoria, Long> {

    @Autowired
    private CategoriaRepository repo;

    @Override
    public JpaRepository<Categoria, Long> getJpaRepository() {
        return repo;
    }
}
