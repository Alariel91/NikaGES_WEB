package com.mony.nikages.vo;

// Generated 18-mar-2015 18:58:52 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoImpuesto generated by hbm2java
 */
@Entity
@Table(name = "tipo_impuesto", catalog = "nikages")
public class TipoImpuesto implements java.io.Serializable {

	private Integer id;
	private String nombreImp;
	private Float valor;
	private String descripcion;
	private Set<Articulo> articulos = new HashSet<Articulo>(0);

	public TipoImpuesto() {
	}

	public TipoImpuesto(String nombreImp, Float valor, String descripcion,
			Set<Articulo> articulos) {
		this.nombreImp = nombreImp;
		this.valor = valor;
		this.descripcion = descripcion;
		this.articulos = articulos;
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

	@Column(name = "nombre_imp", length = 200)
	public String getNombreImp() {
		return this.nombreImp;
	}

	public void setNombreImp(String nombreImp) {
		this.nombreImp = nombreImp;
	}

	@Column(name = "valor", precision = 12, scale = 0)
	public Float getValor() {
		return this.valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	@Column(name = "descripcion", length = 200)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoImpuesto")
	public Set<Articulo> getArticulos() {
		return this.articulos;
	}

	public void setArticulos(Set<Articulo> articulos) {
		this.articulos = articulos;
	}

}
