package domain;
/**
 * Definicion de la clase Region
 * @author Rafael Acosta, Ronald Rubi
 */
public class Region {
	 /**
	 * Variables por defecto para la clase Region
	 */
	  private String codRegion;
	  private String nombre;
	  private String sucursal_codSucursal;
	  
	  /**
	   * Constructores para la clase Region
	   */
	  public Region () {};
	  /**
	   * Constructor con parametros
		* @param codRegion
		* @param nombre
		* @param sucursal_codSucursal
	   */
	  public Region (String codRegion, String nombre, String sucursal_codSucursal) {
		  this.codRegion=codRegion;
		  this.nombre=nombre;
		  this.sucursal_codSucursal=sucursal_codSucursal;
	  };
	  
	  /**
	   * Creacion de metodos set para la clase Region
	   * 
	   */
	  public void setCodRegion(String codRegion) {this.codRegion=codRegion;}
	  public void setNombre(String nombre) {this.nombre=nombre;}
	  public void setSucursalCodSucursal(String sucursal_codSucursal) {this.sucursal_codSucursal=sucursal_codSucursal;}
	  
	  /**
	   * 
	   * Creacion de metodos get para la clase Region
	   */
	  public String getCodRegion() {return codRegion;}
	  public String getNombre() {return nombre;}
	  public String getSucursalCodSucursal() {return sucursal_codSucursal;}
}