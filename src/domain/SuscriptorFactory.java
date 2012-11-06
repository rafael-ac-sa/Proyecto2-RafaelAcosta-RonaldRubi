package domain;
/**
 * Creacion de la clase de fabricacion de objetos para las Suscriptores
 * @author Rafael Acosta, Ronald Rubi
 */
public class SuscriptorFactory {
	/**
	 * Metodo para crear la fabrica de Suscriptor
	 * @param idSuscriptor
	 * @param nombre
	 * @param identificacion
	 * @param telefono
	 * @param direccion
	 * @return
	 */
	public Suscriptor Create(String idSuscriptor,String nombre,String identificacion,String telefono,String direccion) {
		try {
			Suscriptor obj = new Suscriptor();
			obj.setIdSuscriptor(idSuscriptor);
			obj.setNombre(nombre);
			obj.setIdentificacion(identificacion);
			obj.setTelefono(telefono);
			obj.setDireccion(direccion);

			return obj;
		} catch (Exception e) {
			return null;
		}
	}
}