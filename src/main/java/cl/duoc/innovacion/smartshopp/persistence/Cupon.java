package cl.duoc.innovacion.smartshopp.persistence;
// Generated 06-05-2017 15:37:59 by Hibernate Tools 5.2.1.Final

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Cupon generated by hbm2java
 */
@Entity
public class Cupon implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private int idCupon;
	private String codigo;
	private Integer idOferta;
	private Integer idUsuario;

	public Cupon() {
	}

	public Cupon(int idCupon) {
		this.idCupon = idCupon;
	}

	public Cupon(int idCupon, String codigo, Integer idOferta, Integer idUsuario) {
		this.idCupon = idCupon;
		this.codigo = codigo;
		this.idOferta = idOferta;
		this.idUsuario = idUsuario;
	}

	public int getIdCupon() {
		return this.idCupon;
	}

	public void setIdCupon(int idCupon) {
		this.idCupon = idCupon;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getIdOferta() {
		return this.idOferta;
	}

	public void setIdOferta(Integer idOferta) {
		this.idOferta = idOferta;
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

}
