package med.voll.api.dominio.consulta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    boolean existsByPacienteIdAndFechaBetween(Long aLong, LocalDateTime primerhorario, LocalDateTime ultimohorario);

    boolean existsByMedicoIdAndFecha(Long aLong, LocalDateTime fecha);
}