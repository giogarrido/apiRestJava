package med.voll.api.dominio.consulta;

import java.time.LocalDateTime;

public record DatosDetalleConsulta(Long id, Long idMedico, Long idPaciente, LocalDateTime fecha) {
}
