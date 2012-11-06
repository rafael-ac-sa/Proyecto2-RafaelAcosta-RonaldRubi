package domain;
/**
 * Creacion de la clase de fabricacion de objetos para las sucursales
 * @author Rafael Acosta, Ronald Rubi
 */
public class SucursalFactory {
	/**
	 * Metodo para crear la fabrica de sucursal
	 * @param codSucursal
	 * @param telefono
	 * @param ciudad
	 * @param direccion
	 * @param encargado
	 * @return
	 */
	public Sucursal Create(String codSucursal,String telefono,String ciudad,String direccion,String encargado) {
		try {
			Sucursal obj = new Sucursal();
			obj.setCodSucursal(codSucursal);
			obj.setTelefono(telefono);
			obj.setCiudad(ciudad);
			obj.setDireccion(direccion);
			obj.setEncargado(encargado);
			
			return obj;
		} catch (Exception e) {
			return null;
		}
	}
}