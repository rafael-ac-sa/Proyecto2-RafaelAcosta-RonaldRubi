package domain;
/**
 * Definicion de la clase Averia
 * @author Rafael Acosta, Ronald Rubi
 */
public class Averia {
	 /**
	 * Variables por defecto para la clase Averia
	 */
	 
	  private String codAveria;
	  private String descripcion;
	  private String fecha;
	  private String servicio_codServicio;
	  
	  /**
	   * Constructores para la clase Averia
	   */
	  public Averia () {};
	  /**
	   * Constructor con parametros
	   * @param codAveria
	   * @param descripcion
	   * @param fecha
	   * @param servicio_codServicio
	   */
	  public Averia (String codAveria,String descripcion,String fecha,String servicio_codServicio) {
		  this.codAveria=codAveria;
		  this.descripcion=descripcion;
		  this.fecha=fecha;
		  this.servicio_codServicio=servicio_codServicio;
	  };
	  
	  /**
	   * Creacion de metodos set para la clase Averia
	   * 
	   */
	  public void setCodAveria(String codAveria) {this.codAveria=codAveria;}
	  public void setDescripcion(String descripcion) {this.descripcion=descripcion;}
	  public void setFecha(String fecha) {this.fecha=fecha;}
	  public void setServicioCodServicio(String servicio_codServicio) {this.servicio_codServicio=servicio_codServicio;}
	  
	  /**
	   * 
	   * Creacion de metodos get para la clase Servicio
	   */
	  public String getCodAveria() {return codAveria;}
	  public String getDescripcion() {return descripcion;}
	  public String getFecha() {return fecha;}
	  public String getServicioCodServicio() {return servicio_codServicio;}
}