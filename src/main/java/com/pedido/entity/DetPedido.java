package com.pedido.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TP_DETPEDIDO")
public class DetPedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int codped ;
	private int numpedido;
	private int codproducto;
	private long precio;
    private int  cantidad;
    private int  descuento;
    private String horapedido; 
    
	public int getCodped() {
		return codped;
	}
	public void setCodped(int codped) {
		this.codped = codped;
	}
	public int getNumpedido() {
		return numpedido;
	}
	public void setNumpedido(int numpedido) {
		this.numpedido = numpedido;
	}
	
	public int getCodproducto() {
		return codproducto;
	}
	public void setCodproducto(int codproducto) {
		this.codproducto = codproducto;
	}
	
	public long getPrecio() {
		return precio;
	}
	public void setPrecio(long precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public String getHorapedido() {
		return horapedido;
	}
	public void setHorapedido(String horapedido) {
		this.horapedido = horapedido;
	}
	

}
