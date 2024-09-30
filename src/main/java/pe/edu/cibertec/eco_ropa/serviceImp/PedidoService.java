package pe.edu.cibertec.eco_ropa.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.eco_ropa.entidad.Pedido;
import pe.edu.cibertec.eco_ropa.repositorio.PedidoRepository;
import pe.edu.cibertec.eco_ropa.serviceImp.IMP.ICRUDImp;

@Service
public class PedidoService extends ICRUDImp<Pedido, Long> {

    @Autowired
    private PedidoRepository repo;

    @Override
    public JpaRepository<Pedido, Long> getJpaRepository() {
        return repo;
    }
}
