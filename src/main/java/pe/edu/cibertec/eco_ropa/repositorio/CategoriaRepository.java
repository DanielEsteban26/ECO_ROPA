package pe.edu.cibertec.eco_ropa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.eco_ropa.entidad.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
