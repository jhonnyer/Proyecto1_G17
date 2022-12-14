package com.unab.app.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalleFactura")
public class DetalleFactura implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_detalle_factura")
	private Long id;

	@Column(name = "cantidad")
	private Integer cantidad;

	@Column(name = "precio_unitario")
	private Long precioUnitario;

	@ManyToOne()
	@JoinColumn(name = "producto_id_producto", referencedColumnName = "id_producto")
	private Producto producto;

	@ManyToOne()
	@JoinColumn(name = "factura_id_factura", referencedColumnName = "id_factura")
	private Factura factura;

	public DetalleFactura() {
	}

	public DetalleFactura(Long id, Integer cantidad, Long precioUnitario, Producto producto, Factura factura) {
		this.id = id;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.producto = producto;
		this.factura = factura;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Long getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Long precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

}
