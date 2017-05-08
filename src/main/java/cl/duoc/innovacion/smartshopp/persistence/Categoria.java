package cl.duoc.innovacion.smartshopp.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;

// Generated 06-05-2017 15:37:59 by Hibernate Tools 5.2.1.Final

/**
 * Categoria generated by hbm2java
 */
@Entity
public class Categoria implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int idCategoria;
	private String nombre;

	public Categoria() {
	}

	public Categoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Categoria(int idCategoria, String nombre) {
		this.idCategoria = idCategoria;
		this.nombre = nombre;
	}

	public int getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
