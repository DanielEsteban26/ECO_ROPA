package pe.edu.cibertec.eco_ropa.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.eco_ropa.entidad.Producto;
import pe.edu.cibertec.eco_ropa.repositorio.ProductoRepository;
import pe.edu.cibertec.eco_ropa.serviceImp.IMP.ICRUDImp;

@Service
public class ProductoService extends ICRUDImp<Producto, Long> {

    @Autowired
    private ProductoRepository repo;

    @Override
    public JpaRepository<Producto, Long> getJpaRepository() {
        return repo;
    }
}