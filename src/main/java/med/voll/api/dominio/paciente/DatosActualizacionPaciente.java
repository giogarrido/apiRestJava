package med.voll.api.dominio.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import med.voll.api.dominio.direccion.DatosDireccion;

public record DatosActualizacionPaciente(
        Long id,
        String nombre,
        @Email String email,
        String telefono,
        String documentoIdentidad,
        @Valid DatosDireccion direccion
) {
}