package domain;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
/**
 * Creacion de la clase repositorio de objetos Servicio
 * @author Rafael Acosta, Ronald Rubi
 */
public class ServicioRepository {
	private Map<String, Servicio> servicios;
	
	/**
	 * Constructores del repositorio Servicio
	 */
	ServicioRepository() {
		servicios = new HashMap<String, Servicio>();
	}
	
	/**
	 * Metodo para ingresar un servicio
	 * @param obj
	 * @return true si se inserto correctamente
	 */
	public boolean insertServicio(Servicio obj) {
		if (servicios.containsKey(obj.getCodServicio()))
			return false;
		else
			servicios.put(obj.getCodServicio(), obj);
		return true;
	}

	/**
	 * Metodo para borrar un servicio
	 * @param obj
	 * @return true si se borra correctamente
	 */
	public boolean deleteServicio(Servicio obj) {
		if (!servicios.containsKey(obj.getCodServicio()))
			return false;
		else
			servicios.remove(obj.getCodServicio());
		return true;
	}

	/**
	 * Metodo para buscar un servicio por id
	 * @param id
	 * @return el servicio
	 */
	public Servicio findServicio(String id) {
		if (!servicios.containsKey(id))
			return null;
		else
			return servicios.get(id);
	}

	/**
	 * Metodo para actualizar un servicio
	 * @param obj
	 * @return true si se actualizo correctamente
	 */
	public boolean updateServicio(Servicio obj) {
		if (!servicios.containsKey(obj.getCodServicio()))
			return false;
		else
			servicios.put(obj.getCodServicio(), obj);
		return true;
	}

	/**
	 * Metodo para obtener todos los servicios
	 * @return la coleccion de servicios
	 */
	public Collection findAllServicio() {
		return servicios.values();
	}

	/**
	 * Metodo para setear los servicios
	 * @param servicios
	 */
	public void setServicios(Map servicios) {
		this.servicios = servicios;
	}
}