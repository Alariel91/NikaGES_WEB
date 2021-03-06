package com.mony.nikages.vo;

// Generated 18-mar-2015 18:58:52 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Articulo generated by hbm2java
 */
@Entity
@Table(name = "articulo", catalog = "nikages")
public class Articulo implements java.io.Serializable {

	private Integer id;
	private Almacen almacen;
	private Categoria categoria;
	private Proveedor proveedor;
	private TipoImpuesto tipoImpuesto;
	private String nombreArt;
	private Float precio;
	private String descripcion;
	private Integer stock;

	public Articulo() {
	}

	public Articulo(Almacen almacen, Categoria categoria, Proveedor proveedor,
			TipoImpuesto tipoImpuesto, String nombreArt, Float precio,
			String descripcion, Integer stock) {
		this.almacen = almacen;
		this.categoria = categoria;
		this.proveedor = proveedor;
		this.tipoImpuesto = tipoImpuesto;
		this.nombreArt = nombreArt;
		this.precio = precio;
		this.descripcion = descripcion;
		this.stock = stock;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_almacen")
	public Almacen getAlmacen() {
		return this.almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_categoria")
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_proveedor")
	public Proveedor getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_impuesto")
	public TipoImpuesto getTipoImpuesto() {
		return this.tipoImpuesto;
	}

	public void setTipoImpuesto(TipoImpuesto tipoImpuesto) {
		this.tipoImpuesto = tipoImpuesto;
	}

	@Column(name = "nombre_art", length = 200)
	public String getNombreArt() {
		return this.nombreArt;
	}

	public void setNombreArt(String nombreArt) {
		this.nombreArt = nombreArt;
	}

	@Column(name = "precio", precision = 12, scale = 0)
	public Float getPrecio() {
		return this.precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	@Column(name = "descripcion", length = 200)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "stock")
	public Integer getStock() {
		return this.stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
