package pe.edu.cibertec.eco_ropa.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.eco_ropa.entidad.DetallePedido;
import pe.edu.cibertec.eco_ropa.repositorio.DetallePedidoRepository;
import pe.edu.cibertec.eco_ropa.serviceImp.IMP.ICRUDImp;

@Service
public class DetallePedidoService extends ICRUDImp<DetallePedido, Long> {

    @Autowired
    private DetallePedidoRepository repo;

    @Override
    public JpaRepository<DetallePedido, Long> getJpaRepository() {
        return repo;
    }
}
