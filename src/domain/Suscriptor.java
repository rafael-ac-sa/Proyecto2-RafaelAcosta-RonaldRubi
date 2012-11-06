package domain;
/**
 * Definicion de la clase Suscriptor
 * @author Rafael Acosta, Ronald Rubi
 */
public class Suscriptor {
	 /**
	 * Variables por defecto para la clase Suscriptor
	 */
	  private String idSuscriptor;
	  private String nombre;
	  private String identificacion;
	  private String telefono;
	  private String direccion;
	  
	  /**
	   * Constructores para la clase Suscriptor
	   */
	  public Suscriptor () {};
	  /**
	   * Constructor con parametros
	   * @param idSuscriptor
	   * @param nombre
	   * @param identificacion
	   * @param telefono
	   * @param direccion
	   */
	  public Suscriptor (String idSuscriptor,String nombre,String identificacion,String telefono,String direccion) {
		  this.idSuscriptor=idSuscriptor;
		  this.nombre=nombre;
		  this.identificacion=identificacion;
		  this.telefono=telefono;
		  this.direccion=direccion;
	  };
	  
	  /**
	   * Creacion de metodos set para la clase Suscriptor
	   * 
	   */
	  public void setIdSuscriptor(String idSuscriptor) {this.idSuscriptor=idSuscriptor;}
	  public void setNombre(String nombre) {this.nombre=nombre;}
	  public void setIdentificacion(String identificacion) {this.identificacion=identificacion;}
	  public void setTelefono(String telefono) {this.telefono=telefono;}
	  public void setDireccion(String direccion) {this.direccion=direccion;}
	  
	  /**
	   * 
	   * Creacion de metodos get para la clase Suscriptor
	   */
	  public String getIdSuscriptor() {return idSuscriptor;}
	  public String getNombre() {return nombre;}
	  public String getIdentificacion() {return identificacion;}
	  public String getTelefono() {return telefono;}
	  public String getDireccion() {return direccion;}
}