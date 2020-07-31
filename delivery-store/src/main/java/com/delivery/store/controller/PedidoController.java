package com.delivery.store.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.store.controller.form.PedidoForm;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@PostMapping
	public void salvar(@RequestBody PedidoForm pedido) {
		System.out.println("Salvando pedido..");
	}

}
