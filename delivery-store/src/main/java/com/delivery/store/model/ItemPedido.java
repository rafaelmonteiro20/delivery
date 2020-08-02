package com.delivery.store.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String produto;

	private int quantidade;

	private BigDecimal precoUnitario;

	@ManyToOne
	@JoinColumn(name = "id_pedido")
	private Pedido pedido;

	public ItemPedido() {

	}

	public ItemPedido(String produto, int quantidade, BigDecimal precoUnitario) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}

	public String getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}

	public Pedido getPedido() {
		return pedido;
	}

	protected void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
