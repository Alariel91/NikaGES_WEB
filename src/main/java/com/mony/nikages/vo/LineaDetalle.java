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
 * LineaDetalle generated by hbm2java
 */
@Entity
@Table(name = "linea_detalle", catalog = "nikages")
public class LineaDetalle implements java.io.Serializable {

	private Integer id;
	private Pedido pedido;
	private Integer cantidad;
	private Float precio;
	private int idArticulo;

	public LineaDetalle() {
	}

	public LineaDetalle(Pedido pedido, int idArticulo) {
		this.pedido = pedido;
		this.idArticulo = idArticulo;
	}

	public LineaDetalle(Pedido pedido, Integer cantidad, Float precio,
			int idArticulo) {
		this.pedido = pedido;
		this.cantidad = cantidad;
		this.precio = precio;
		this.idArticulo = idArticulo;
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
	@JoinColumn(name = "id_pedido", nullable = false)
	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Column(name = "cantidad")
	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Column(name = "precio", precision = 12, scale = 0)
	public Float getPrecio() {
		return this.precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	@Column(name = "id_articulo", nullable = false)
	public int getIdArticulo() {
		return this.idArticulo;
	}

	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}

}
