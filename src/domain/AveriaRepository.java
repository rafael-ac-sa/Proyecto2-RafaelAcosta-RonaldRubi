package domain;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
/**
 * Creacion de la clase repositorio de objetos Averia
 * @author Rafael Acosta, Ronald Rubi
 */
public class AveriaRepository {
	private Map<String, Averia> averias;
	
	/**
	 * Constructores del repositorio Averia
	 */
	AveriaRepository() {
		averias = new HashMap<String, Averia>();
	}
	
	/**
	 * Metodo para ingresar una averia
	 * @param obj
	 * @return true si se inserto correctamente
	 */
	public boolean insertAveria(Averia obj) {
		if (averias.containsKey(obj.getCodAveria()))
			return false;
		else
			averias.put(obj.getCodAveria(), obj);
		return true;
	}

	/**
	 * Metodo para borrar una averia
	 * @param obj
	 * @return true si se borra correctamente
	 */
	public boolean deleteAveria(Averia obj) {
		if (!averias.containsKey(obj.getCodAveria()))
			return false;
		else
			averias.remove(obj.getCodAveria());
		return true;
	}

	/**
	 * Metodo para buscar una averia por id
	 * @param id
	 * @return la averia
	 */
	public Averia findAveria(String id) {
		if (!averias.containsKey(id))
			return null;
		else
			return averias.get(id);
	}

	/**
	 * Metodo para actualizar una averia
	 * @param obj
	 * @return true si se actualizo correctamente
	 */
	public boolean updateAveria(Averia obj) {
		if (!averias.containsKey(obj.getCodAveria()))
			return false;
		else
			averias.put(obj.getCodAveria(), obj);
		return true;
	}

	/**
	 * Metodo para obtener todos las averias
	 * @return la coleccion de averias
	 */
	public Collection findAllAveria() {
		return averias.values();
	}

	/**
	 * Metodo para setear las averias
	 * @param averias
	 */
	public void setAverias(Map averias) {
		this.averias = averias;
	}
}