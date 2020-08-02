package com.delivery.store.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDateTime dataCriacao = LocalDateTime.now();

	private StatusPedido status = StatusPedido.NOVO;

	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
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
		itemPedido.setPedido(this);
	}

}
