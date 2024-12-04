package med.voll.api.dominio.consulta.validaciones;

import med.voll.api.dominio.ValidacionException;
import med.voll.api.dominio.consulta.ConsultaRepository;
import med.voll.api.dominio.consulta.DatosReservaConsulta;

public class ValidacionMedicoConOtraConsultaEnElMismoHorario {

    private ConsultaRepository consultaRepository;

    public void validar(DatosReservaConsulta datos){
        var medicoTieneOtraConsultaEnElMismoHorario = consultaRepository.existsByMedicoIdAndFecha(datos.idMedico(), datos.fecha());
        if(medicoTieneOtraConsultaEnElMismoHorario){
            throw new ValidacionException("Medico ya tiene otra consulta en esa misma fecha y hora");
        }
    }
}
