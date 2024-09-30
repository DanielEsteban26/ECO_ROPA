package pe.edu.cibertec.eco_ropa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.eco_ropa.entidad.ImagenProducto;

public interface ImagenProductoRepository extends JpaRepository<ImagenProducto, Long> {
}