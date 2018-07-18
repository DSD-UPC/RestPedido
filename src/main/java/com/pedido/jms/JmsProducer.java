package com.pedido.jms;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsProducer {
@Autowired
private JmsTemplate JmsTemplate;
@Value("${jms.cola.envio}")
String colaDestino;

public void Enviar(String mensaje) {
	
	String id = UUID.randomUUID().toString();
	JmsTemplate.convertAndSend(colaDestino, mensaje, m-> {
		m.setJMSCorrelationID(id);
		return m;
	});
	
		
}






}