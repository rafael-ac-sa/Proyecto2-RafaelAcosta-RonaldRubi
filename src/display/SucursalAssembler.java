package display;

import domain.Sucursal;
/**
 * Ensamblador de la sucursal
 * @author Rafael Acosta, Ronald Rubi
 *
 */
public class SucursalAssembler {
	/**
	 * Creacion del DTO de la sucursal
	 * @param obj
	 * @return
	 */
	public static SucursalDTO Create(Sucursal obj) {
		SucursalDTO dto = new SucursalDTO();
		dto.codSucursal = obj.getCodSucursal();
		dto.telefono = obj.getTelefono();
		dto.ciudad = obj.getCiudad();
		dto.direccion = obj.getDireccion();
		dto.encargado = obj.getEncargado();
		return dto;
	}
}