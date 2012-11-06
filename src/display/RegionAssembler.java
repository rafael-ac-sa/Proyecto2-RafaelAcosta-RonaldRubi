package display;

import domain.Region;
/**
 * Ensamblador de la region
 * @author Rafael Acosta, Ronald Rubi
 *
 */
public class RegionAssembler {
	/**
	 * Creacion del DTO de la region
	 * @param obj
	 * @return
	 */
	public static RegionDTO Create(Region obj) {
		RegionDTO dto = new RegionDTO();
		dto.codRegion = obj.getCodRegion();
		dto.nombre = obj.getNombre();
		dto.sucursal_codSucursal = obj.getSucursalCodSucursal();
		return dto;
	}
}