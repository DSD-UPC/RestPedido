package com.pedido.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedido.entity.DetPedido;
import com.pedido.repository.DetPedidoRepository;

@RestController
@RequestMapping("/detpedido")
public class DetPedidoController {

	@Autowired
	private DetPedidoRepository detpedidoRepository;
	
	@PostMapping("/registrar")
	public DetPedido registrarDetPedido(@Valid @RequestBody DetPedido detpedido) {		
		return detpedidoRepository.save(detpedido);		
	}
	
}
