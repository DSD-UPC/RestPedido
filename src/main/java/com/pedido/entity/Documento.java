package com.pedido.entity;

import java.io.Serializable;

public class Documento implements Serializable{


    private String nroruc;
	private String mensaje;
	
    public String getNroruc() {
		return nroruc;
	}

	public void setNroruc(String nroruc) {
		this.nroruc = nroruc;
	} 
	  
    public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	  
  } 
	
