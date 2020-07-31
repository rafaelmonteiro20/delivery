package com.delivery.store.model;

import java.math.BigDecimal;

public class ItemPedido {

	private int quantidade;

	private BigDecimal precoUnitario;

	public ItemPedido(int quantidade, BigDecimal precoUnitario) {
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}

}
