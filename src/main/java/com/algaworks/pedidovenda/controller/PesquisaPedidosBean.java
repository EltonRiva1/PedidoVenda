package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaPedidosBean {
	private List<Integer> pedidosFiltrados;

	public PesquisaPedidosBean() {
		this.pedidosFiltrados = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			this.pedidosFiltrados.add(i);
		}
	}

	public List<Integer> getPedidosFiltrados() {
		return this.pedidosFiltrados;
	}
}
