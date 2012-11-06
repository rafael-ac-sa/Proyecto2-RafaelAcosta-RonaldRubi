package domain;
/**
 * Definicion de la clase Sucursal
 * @author Rafael Acosta, Ronald Rubi
 */
public class Sucursal {
	 /**
	 * Variables por defecto para la clase Sucursal
	 */
	  private String codSucursal;
	  private String telefono;
	  private String ciudad;
	  private String direccion;
	  private String encargado;
	  
	  /**
	   * Constructores para la clase Sucursal
	   */
	  public Sucursal () {};
	  /**
	   * Constructor con parametros
	   * @param codSucursal
	   * @param telefono
	   * @param ciudad
	   * @param direccion
	   * @param encargado
	   */
	  public Sucursal (String codSucursal,String telefono,String ciudad,String direccion,String encargado) {
		  this.codSucursal=codSucursal;
		  this.telefono=telefono;
		  this.ciudad=ciudad;
		  this.direccion=direccion;
		  this.encargado=encargado;
	  };
	  
	  /**
	   * Creacion de metodos set para la clase Sucursal
	   * 
	   */
	  public void setCodSucursal(String codSucursal) {this.codSucursal=codSucursal;}
	  public void setTelefono(String telefono) {this.telefono=telefono;}
	  public void setCiudad(String ciudad) {this.ciudad=ciudad;}
	  public void setDireccion(String direccion) {this.direccion=direccion;}
	  public void setEncargado(String encargado) {this.encargado=encargado;}
	  
	  /**
	   * 
	   * Creacion de metodos get para la clase Sucursal
	   */
	  public String getCodSucursal() {return codSucursal;}
	  public String getTelefono() {return telefono;}
	  public String getCiudad() {return ciudad;}
	  public String getDireccion() {return direccion;}
	  public String getEncargado() {return encargado;}
}