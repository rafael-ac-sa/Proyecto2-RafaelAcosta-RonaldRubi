package domain;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
/**
 * Creacion de la clase repositorio de objetos sucursal
 * @author Rafael Acosta, Ronald Rubi
 */
public class SucursalRepository {
	private Map<String, Sucursal> sucursales;
	
	/**
	 * Constructores del repositorio sucursal
	 */
	SucursalRepository() {
		sucursales = new HashMap<String, Sucursal>();
	}
	
	/**
	 * Metodo para ingresar una sucursal
	 * @param obj
	 * @return true si se inserto correctamente
	 */
	public boolean insertSucursal(Sucursal obj) {
		if (sucursales.containsKey(obj.getCodSucursal()))
			return false;
		else
			sucursales.put(obj.getCodSucursal(), obj);
		return true;
	}

	/**
	 * Metodo para borrar una sucursal
	 * @param obj
	 * @return true si se borra correctamente
	 */
	public boolean deleteSucursal(Sucursal obj) {
		if (!sucursales.containsKey(obj.getCodSucursal()))
			return false;
		else
			sucursales.remove(obj.getCodSucursal());
		return true;
	}

	/**
	 * Metodo para buscar una sucursal por id
	 * @param id
	 * @return la sucursal
	 */
	public Sucursal findSucursal(String id) {
		if (!sucursales.containsKey(id))
			return null;
		else
			return sucursales.get(id);
	}

	/**
	 * Metodo para actualizar una sucursal
	 * @param obj
	 * @return true si se actualizo correctamente
	 */
	public boolean updateSucursal(Sucursal obj) {
		if (!sucursales.containsKey(obj.getCodSucursal()))
			return false;
		else
			sucursales.put(obj.getCodSucursal(), obj);
		return true;
	}

	/**
	 * Metodo para obtener todas las sucursales
	 * @return la coleccion de sucursales
	 */
	public Collection findAllSucursal() {
		return sucursales.values();
	}

	/**
	 * Metodo para setear las sucursales
	 * @param sucursales
	 */
	public void setSucursales(Map sucursales) {
		this.sucursales = sucursales;
	}
}