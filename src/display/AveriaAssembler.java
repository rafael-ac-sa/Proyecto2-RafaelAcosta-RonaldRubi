package display;

import domain.Averia;
/**
 * Ensamblador del averia
 * @author Rafael Acosta, Ronald Rubi
 *
 */
public class AveriaAssembler {
	/**
	 * Creacion del DTO del averia
	 * @param obj
	 * @return
	 */
	public static AveriaDTO Create(Averia obj) {
		AveriaDTO dto = new AveriaDTO();
		dto.codAveria = obj.getCodAveria();
		dto.descripcion = obj.getDescripcion();
		dto.fecha = obj.getFecha();
		dto.servicio_codServicio = obj.getServicioCodServicio();
		return dto;
	}
}