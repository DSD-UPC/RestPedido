package com.pedido.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TP_PEDIDO")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int codpedido;
	
	private String numcliente;
	private int nummesa;
	private String fechpedido;
	private int estproceso;
	private int estpedido;
	private String obspersonal;
	private String fechupdpedido;
	private String obscliente;
	private String codusuario;
	public int getCodpedido() {
		return codpedido;
	}
	public void setCodpedido(int codpedido) {
		this.codpedido = codpedido;
	}
	
	public String getNumcliente() {
		return numcliente;
	}
	public void setNumcliente(String numcliente) {
		this.numcliente = numcliente;
	}
	public int getNummesa() {
		return nummesa;
	}
	public void setNummesa(int nummesa) {
		this.nummesa = nummesa;
	}
	public String getFechpedido() {
		return fechpedido;
	}
	public void setFechpedido(String fechpedido) {
		this.fechpedido = fechpedido;
	}
	public int getEstproceso() {
		return estproceso;
	}
	public void setEstproceso(int estproceso) {
		this.estproceso = estproceso;
	}
	public int getEstpedido() {
		return estpedido;
	}
	public void setEstpedido(int estpedido) {
		this.estpedido = estpedido;
	}
	public String getObspersonal() {
		return obspersonal;
	}
	public void setObspersonal(String obspersonal) {
		this.obspersonal = obspersonal;
	}
	public String getFechupdpedido() {
		return fechupdpedido;
	}
	public void setFechupdpedido(String fechupdpedido) {
		this.fechupdpedido = fechupdpedido;
	}
	public String getObscliente() {
		return obscliente;
	}
	public void setObscliente(String obscliente) {
		this.obscliente = obscliente;
	}
	public String getCodusuario() {
		return codusuario;
	}
	public void setCodusuario(String codusuario) {
		this.codusuario = codusuario;
	}

	
	

}
