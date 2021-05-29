package com.automotriz.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String codigo;
	@Column(name = "nombre_prod")
	private String nombreProd;
	@Column(name = "precio_prod")
	private String precioProd;
	@Column(name = "fecha_registro")
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
	@Column(name = "usuario_registro")
	private String usuarioRegistro;
	@Column (name = "usuario_actualiza")
	private String usuarioUpate;
	@Column (name = "cantidad")
	private String cantidad;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombreProd() {
		return nombreProd;
	}

	public void setNombreProd(String nombreProd) {
		this.nombreProd = nombreProd;
	}

	public String getPrecioProd() {
		return precioProd;
	}

	public void setPrecioProd(String precioProd) {
		this.precioProd = precioProd;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getUsuarioRegistro() {
		return usuarioRegistro;
	}

	public void setUsuarioRegistro(String usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}

	public String getUsuarioUpate() {
		return usuarioUpate;
	}

	public void setUsuarioUpate(String usuarioUpate) {
		this.usuarioUpate = usuarioUpate;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;

}
