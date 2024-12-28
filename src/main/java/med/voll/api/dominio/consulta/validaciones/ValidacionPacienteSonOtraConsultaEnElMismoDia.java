package med.voll.api.dominio.consulta.validaciones;

import med.voll.api.dominio.ValidacionException;
import med.voll.api.dominio.consulta.ConsultaRepository;
import med.voll.api.dominio.consulta.DatosReservaConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidacionPacienteSonOtraConsultaEnElMismoDia implements ValidacionDeConsultas{
    @Autowired
    private ConsultaRepository consultaRepository;

    public void validar(DatosReservaConsulta datos){
        var primerhorario = datos.fecha().withHour(7);
        var ultimohorario = datos.fecha().withHour(18);
        var pacienteTieneOtraConsultaEnElDia = consultaRepository.existsByPacienteIdAndFechaBetween(datos.idPaciente(), primerhorario, ultimohorario);
        if(pacienteTieneOtraConsultaEnElDia){
            throw new ValidacionException("Paciente ya tiene reservada una consulta reservada para ese día");
        }


    }
}
