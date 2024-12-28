package med.voll.api.dominio.consulta.validaciones;

import med.voll.api.dominio.consulta.Consulta;
import med.voll.api.dominio.consulta.DatosReservaConsulta;

public interface ValidacionDeConsultas {
    void validar(DatosReservaConsulta datos);
}
