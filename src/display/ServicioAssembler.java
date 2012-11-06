package display;

import domain.Servicio;
/**
 * Ensamblador del servicio
 * @author Rafael Acosta, Ronald Rubi
 *
 */
public class ServicioAssembler {
	/**
	 * Creacion del DTO del servicio
	 * @param obj
	 * @return
	 */
	public static ServicioDTO Create(Servicio obj) {
		ServicioDTO dto = new ServicioDTO();
		dto.codServicio = obj.getCodServicio();
		dto.fechaInst = obj.getFechaInst();
		dto.direccion = obj.getDireccion();
		dto.region_codRegion = obj.getRegionCodRegion();
		dto.suscriptor_idSuscriptor = obj.getSuscriptorIdSuscriptor();
		return dto;
	}
}