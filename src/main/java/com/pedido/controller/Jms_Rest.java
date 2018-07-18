package com.pedido.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pedido.entity.Documento;
import com.pedido.jms.JmsProducer;



@RestController
@RequestMapping("/jms")
public class Jms_Rest {
	@Autowired

	private JmsProducer jmsproducer;
	@PostMapping("/Ruc")

	public Documento EvaluarRuc(@Valid @RequestBody Documento documento) {
		
		 ObjectMapper mapper = new ObjectMapper();
		 String jsonString=null;
		 try {
			jsonString = mapper.writeValueAsString(documento);		
			jmsproducer.Enviar(jsonString);
			System.out.println("EVALUACION 1 ENVIANDO:"+ jsonString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return documento;		
		
		
	}
	

		 
	
	
}
	