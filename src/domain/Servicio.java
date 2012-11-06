package domain;
/**
 * Definicion de la clase Servicio
 * @author Rafael Acosta, Ronald Rubi
 */
public class Servicio {
	 /**
	 * Variables por defecto para la clase Servicio
	 */
	 
	  private String codServicio;
	  private String fechaInst;
	  private String direccion;
	  private String region_codRegion;
	  private String suscriptor_idSuscriptor;
	  
	  /**
	   * Constructores para la clase Servicio
	   */
	  public Servicio () {};
	  /**
	   * Constructor con parametros
	   * @param codServicio
	   * @param fechaInst
	   * @param direccion
	   * @param region_codRegion
	   * @param suscriptor_idSuscriptor
	   */
	  public Servicio (String codServicio,String fechaInst,String direccion,String region_codRegion,String suscriptor_idSuscriptor) {
		  this.codServicio=codServicio;
		  this.fechaInst=fechaInst;
		  this.direccion=direccion;
		  this.region_codRegion=region_codRegion;
		  this.suscriptor_idSuscriptor=suscriptor_idSuscriptor;
	  };
	  
	  /**
	   * Creacion de metodos set para la clase Servicio
	   * 
	   */
	  public void setCodServicio(String codServicio) {this.codServicio=codServicio;}
	  public void setFechaInst(String fechaInst) {this.fechaInst=fechaInst;}
	  public void setDireccion(String direccion) {this.direccion=direccion;}
	  public void setRegionCodRegion(String region_codRegion) {this.region_codRegion=region_codRegion;}
	  public void setSuscriptorIdSuscriptor(String suscriptor_idSuscriptor) {this.suscriptor_idSuscriptor=suscriptor_idSuscriptor;}
	  
	  /**
	   * 
	   * Creacion de metodos get para la clase Servicio
	   */
	  public String getCodServicio() {return codServicio;}
	  public String getFechaInst() {return fechaInst;}
	  public String getDireccion() {return direccion;}
	  public String getRegionCodRegion() {return region_codRegion;}
	  public String getSuscriptorIdSuscriptor() {return suscriptor_idSuscriptor;}
}