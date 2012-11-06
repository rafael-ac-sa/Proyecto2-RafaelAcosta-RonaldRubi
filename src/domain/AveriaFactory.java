package domain;
/**
 * Creacion de la clase de fabricacion de objetos para las Averias
 * @author Rafael Acosta, Ronald Rubi
 */
public class AveriaFactory {
	/**
	 * Metodo para crear la fabrica de Averia
	   * @param codAveria
	   * @param descripcion
	   * @param fecha
	   * @param servicio_codServicio
	 * @return
	 */
	public Averia Create(String codAveria,String descripcion,String fecha,String servicio_codServicio) {
		try {
			Averia obj = new Averia();
			obj.setCodAveria(codAveria);
			obj.setDescripcion(descripcion);
			obj.setFecha(fecha);
			obj.setServicioCodServicio(servicio_codServicio);

			return obj;
		} catch (Exception e) {
			return null;
		}
	}
}