package com.delivery.store.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedido {

	private LocalDateTime dataCriacao = LocalDateTime.now();

	private StatusPedido status = StatusPedido.NOVO;

	private List<ItemPedido> itens = new ArrayList<>();

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public List<ItemPedido> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void addItem(ItemPedido itemPedido) {
		itens.add(itemPedido);
	}

}
