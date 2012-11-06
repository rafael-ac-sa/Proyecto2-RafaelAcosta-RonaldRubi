package domain;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
/**
 * Creacion de la clase repositorio de objetos Suscriptor
 * @author Rafael Acosta, Ronald Rubi
 */
public class SuscriptorRepository {
	private Map<String, Suscriptor> suscriptores;
	
	/**
	 * Constructores del repositorio Suscriptor
	 */
	SuscriptorRepository() {
		suscriptores = new HashMap<String, Suscriptor>();
	}
	
	/**
	 * Metodo para ingresar un suscriptor
	 * @param obj
	 * @return true si se inserto correctamente
	 */
	public boolean insertSuscriptor(Suscriptor obj) {
		if (suscriptores.containsKey(obj.getIdSuscriptor()))
			return false;
		else
			suscriptores.put(obj.getIdSuscriptor(), obj);
		return true;
	}

	/**
	 * Metodo para borrar un suscriptor
	 * @param obj
	 * @return true si se borra correctamente
	 */
	public boolean deleteSuscriptor(Suscriptor obj) {
		if (!suscriptores.containsKey(obj.getIdSuscriptor()))
			return false;
		else
			suscriptores.remove(obj.getIdSuscriptor());
		return true;
	}

	/**
	 * Metodo para buscar un suscriptor por id
	 * @param id
	 * @return el suscriptor
	 */
	public Suscriptor findSuscriptor(String id) {
		if (!suscriptores.containsKey(id))
			return null;
		else
			return suscriptores.get(id);
	}

	/**
	 * Metodo para actualizar un suscriptor
	 * @param obj
	 * @return true si se actualizo correctamente
	 */
	public boolean updateSuscriptor(Suscriptor obj) {
		if (!suscriptores.containsKey(obj.getIdSuscriptor()))
			return false;
		else
			suscriptores.put(obj.getIdSuscriptor(), obj);
		return true;
	}

	/**
	 * Metodo para obtener todos los suscriptores
	 * @return la coleccion de suscriptores
	 */
	public Collection findAllSuscriptor() {
		return suscriptores.values();
	}

	/**
	 * Metodo para setear las suscriptores
	 * @param suscriptores
	 */
	public void setSuscriptores(Map suscriptores) {
		this.suscriptores = suscriptores;
	}
}