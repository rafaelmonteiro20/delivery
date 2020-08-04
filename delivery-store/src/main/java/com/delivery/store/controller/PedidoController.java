package com.delivery.store.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.store.controller.form.PedidoForm;
import com.delivery.store.model.Pedido;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@PersistenceContext
	private EntityManager manager;

	@PostMapping
	public void salvar(@RequestBody PedidoForm pedido) {
		System.out.println("Salvando pedido..");
	}

	@GetMapping
	public List<Pedido> pesquisar() {
		return manager.createQuery("from Pedido", Pedido.class).getResultList();
	}

}
