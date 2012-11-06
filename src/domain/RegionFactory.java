package domain;
/**
 * Creacion de la clase de fabricacion de objetos para las Regiones
 * @author Rafael Acosta, Ronald Rubi
 */
public class RegionFactory {
	/**
	 * Metodo para crear la fabrica de Region
	 * @param codRegion
	 * @param nombre
	 * @param sucursal_codSucursal
	 * @return
	 */
	 
	public Region Create(String codRegion, String nombre, String sucursal_codSucursal) {
		try {
			Region obj = new Region();
			obj.setCodRegion(codRegion);
			obj.setNombre(nombre);
			obj.setSucursalCodSucursal(sucursal_codSucursal);

			return obj;
		} catch (Exception e) {
			return null;
		}
	}
}