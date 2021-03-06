package com.mony.nikages.vo;

// Generated 18-mar-2015 18:58:52 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Empresa generated by hbm2java
 */
@Entity
@Table(name = "empresa", catalog = "nikages")
public class Empresa implements java.io.Serializable {

	private Integer id;
	private String nif;
	private String direccion;
	private String telefono;
	private String nombre;

	public Empresa() {
	}

	public Empresa(String nif, String direccion, String telefono) {
		this.nif = nif;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public Empresa(String nif, String direccion, String telefono, String nombre) {
		this.nif = nif;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nombre = nombre;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nif", nullable = false, length = 20)
	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	@Column(name = "direccion", nullable = false, length = 200)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "telefono", nullable = false, length = 15)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "nombre", length = 200)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
