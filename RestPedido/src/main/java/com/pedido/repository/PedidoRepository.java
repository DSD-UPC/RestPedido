package com.pedido.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pedido.entity.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

	List<Pedido> findByCodpedido (int codpedido);
}

