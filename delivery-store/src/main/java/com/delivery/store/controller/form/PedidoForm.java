package com.delivery.store.controller.form;

import java.util.ArrayList;
import java.util.List;

public class PedidoForm {

	private List<PedidoItemForm> itens = new ArrayList<>();

	public List<PedidoItemForm> getItens() {
		return itens;
	}

	public void setItens(List<PedidoItemForm> itens) {
		this.itens = itens;
	}

}
