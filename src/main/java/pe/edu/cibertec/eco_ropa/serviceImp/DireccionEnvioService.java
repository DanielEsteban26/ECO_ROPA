package pe.edu.cibertec.eco_ropa.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.eco_ropa.entidad.DireccionEnvio;
import pe.edu.cibertec.eco_ropa.repositorio.DireccionEnvioRepository;
import pe.edu.cibertec.eco_ropa.serviceImp.IMP.ICRUDImp;

@Service
public class DireccionEnvioService extends ICRUDImp<DireccionEnvio, Long> {

    @Autowired
    private DireccionEnvioRepository repo;

    @Override
    public JpaRepository<DireccionEnvio, Long> getJpaRepository() {
        return repo;
    }
}
