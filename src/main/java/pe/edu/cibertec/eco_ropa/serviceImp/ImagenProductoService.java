package pe.edu.cibertec.eco_ropa.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.eco_ropa.entidad.ImagenProducto;
import pe.edu.cibertec.eco_ropa.repositorio.ImagenProductoRepository;
import pe.edu.cibertec.eco_ropa.serviceImp.IMP.ICRUDImp;

@Service
public class ImagenProductoService extends ICRUDImp<ImagenProducto, Long> {

    @Autowired
    private ImagenProductoRepository repo;

    @Override
    public JpaRepository<ImagenProducto, Long> getJpaRepository() {
        return repo;
    }
}

