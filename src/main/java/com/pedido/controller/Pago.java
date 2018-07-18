package com.pedido.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedido.entity.Documento;

@RestController
@RequestMapping("/pago")
public class Pago {
	
	
	@PostMapping("/mensaje")
	public Documento RetornarMensajeCola(@Valid @RequestBody Documento documento){
		
		  Documento documento_1 = new Documento();
		  documento_1.setMensaje(documento.getMensaje());
		  documento_1.setNroruc(documento.getNroruc());
		 
	       return documento_1;
		
	}
	
}
