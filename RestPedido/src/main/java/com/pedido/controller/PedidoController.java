package com.pedido.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedido.entity.Pedido;
import com.pedido.repository.PedidoRepository;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping("/findAll")
	public List<Pedido> obtenerPedido(){
		return (List<Pedido>) pedidoRepository.findAll();
	}
	
	
	@PostMapping("/registrar")
	public Pedido registrarPedido(@Valid @RequestBody Pedido pedido) {		
		return pedidoRepository.save(pedido);		
	}	
	
}
