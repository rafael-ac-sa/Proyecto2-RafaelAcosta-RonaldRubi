package domain;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
/**
 * Creacion de la clase repositorio de objetos Region
 * @author Rafael Acosta, Ronald Rubi
 */
public class RegionRepository {
	private Map<String, Region> regiones;
	
	/**
	 * Constructores del repositorio Region
	 */
	RegionRepository() {
		regiones = new HashMap<String, Region>();
	}
	
	/**
	 * Metodo para ingresar un region
	 * @param obj
	 * @return true si se inserto correctamente
	 */
	public boolean insertRegion(Region obj) {
		if (regiones.containsKey(obj.getCodRegion()))
			return false;
		else
			regiones.put(obj.getCodRegion(), obj);
		return true;
	}

	/**
	 * Metodo para borrar un region
	 * @param obj
	 * @return true si se borra correctamente
	 */
	public boolean deleteRegion(Region obj) {
		if (!regiones.containsKey(obj.getCodRegion()))
			return false;
		else
			regiones.remove(obj.getCodRegion());
		return true;
	}

	/**
	 * Metodo para buscar un region por id
	 * @param id
	 * @return el region
	 */
	public Region findRegion(String id) {
		if (!regiones.containsKey(id))
			return null;
		else
			return regiones.get(id);
	}

	/**
	 * Metodo para actualizar un region
	 * @param obj
	 * @return true si se actualizo correctamente
	 */
	public boolean updateRegion(Region obj) {
		if (!regiones.containsKey(obj.getCodRegion()))
			return false;
		else
			regiones.put(obj.getCodRegion(), obj);
		return true;
	}

	/**
	 * Metodo para obtener todos los regiones
	 * @return la coleccion de regiones
	 */
	public Collection findAllRegion() {
		return regiones.values();
	}

	/**
	 * Metodo para setear las regiones
	 * @param regiones
	 */
	public void setRegiones(Map regiones) {
		this.regiones = regiones;
	}
}