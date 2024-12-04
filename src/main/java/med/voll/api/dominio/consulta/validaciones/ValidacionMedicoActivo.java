package med.voll.api.dominio.consulta.validaciones;

import med.voll.api.dominio.ValidacionException;
import med.voll.api.dominio.consulta.DatosReservaConsulta;
import med.voll.api.dominio.medico.MedicoRepository;

public class ValidacionMedicoActivo {

    private MedicoRepository medicoRepository;

    public void validar(DatosReservaConsulta datos){
        if(datos.idMedico() == null){
            return;
        }
        var medicoEstaActivo = medicoRepository.findActivoById(datos.idMedico());
        if(!medicoEstaActivo){
            throw new ValidacionException("Consulta no puede ser reservada con medico excluido");
        }

    }
}
