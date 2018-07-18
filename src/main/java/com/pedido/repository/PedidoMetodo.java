package com.pedido.repository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PedidoMetodo {

	public String MostrarFecha(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		return dateFormat.format(date);
	}
	
}
