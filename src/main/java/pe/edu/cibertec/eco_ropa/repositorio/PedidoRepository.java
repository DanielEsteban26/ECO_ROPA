package pe.edu.cibertec.eco_ropa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.eco_ropa.entidad.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
