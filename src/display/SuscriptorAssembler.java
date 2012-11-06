package display;

import domain.Suscriptor;
/**
 * Ensamblador del Suscriptor
 * @author Rafael Acosta, Ronald Rubi
 *
 */
public class SuscriptorAssembler {
	/**
	 * Creacion del DTO del Suscriptor
	 * @param obj
	 * @return
	 */
	public static SuscriptorDTO Create(Suscriptor obj) {
		SuscriptorDTO dto = new SuscriptorDTO();
		
		dto.idSuscriptor=obj.getIdSuscriptor();
		dto.nombre=obj.getNombre();
		dto.identificacion=obj.getIdentificacion();
		dto.telefono=obj.getTelefono();
		dto.direccion=obj.getDireccion();
		  
		return dto;
	}
}