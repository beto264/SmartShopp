package cl.duoc.innovacion.smartshopp.persistence;
// Generated 06-05-2017 15:37:59 by Hibernate Tools 5.2.1.Final

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Direccion generated by hbm2java
 */
@Entity
public class Direccion implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private int idDireccion;
	private Integer latitud;
	private Integer longitud;

	public Direccion() {
	}

	public Direccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public Direccion(int idDireccion, Integer latitud, Integer longitud) {
		this.idDireccion = idDireccion;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public int getIdDireccion() {
		return this.idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public Integer getLatitud() {
		return this.latitud;
	}

	public void setLatitud(Integer latitud) {
		this.latitud = latitud;
	}

	public Integer getLongitud() {
		return this.longitud;
	}

	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}

}
