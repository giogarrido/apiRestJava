package med.voll.api.dominio.consulta.validaciones;

import med.voll.api.dominio.ValidacionException;
import med.voll.api.dominio.consulta.DatosReservaConsulta;
import med.voll.api.dominio.paciente.PacienteRepository;

public class ValidacionPacienteActivo {
    private PacienteRepository pacienteRepository;
    public void validar(DatosReservaConsulta datos){
        var pacienteEstaActivo = pacienteRepository.findActivoById(datos.idPaciente());
        if(!pacienteEstaActivo){
            throw new ValidacionException("Consulta no puede ser reservada con paciente excluido");
        }


    }
}
