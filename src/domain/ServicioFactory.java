package domain;
/**
 * Creacion de la clase de fabricacion de objetos para los Servicios
 * @author Rafael Acosta, Ronald Rubi
 */
public class ServicioFactory {
	/**
	 * Metodo para crear la fabrica de Servicio
	 * @param codServicio
	 * @param fechaInst
	 * @param direccion
	 * @param region_codRegion
	 * @param suscriptor_idSuscriptor
	 * @return
	 */
	public Servicio Create(String codServicio,String fechaInst,String direccion,String region_codRegion,String suscriptor_idSuscriptor) {
		try {
			Servicio obj = new Servicio();
			obj.setCodServicio(codServicio);
			obj.setFechaInst(fechaInst);
			obj.setDireccion(direccion);
			obj.setRegionCodRegion(region_codRegion);
			obj.setSuscriptorIdSuscriptor(suscriptor_idSuscriptor);

			return obj;
		} catch (Exception e) {
			return null;
		}
	}
}