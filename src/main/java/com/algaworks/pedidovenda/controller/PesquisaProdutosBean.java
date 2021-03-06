package com.algaworks.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaProdutosBean {
	private List<Integer> produtosFiltrados;

	public PesquisaProdutosBean() {
		this.produtosFiltrados = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			this.produtosFiltrados.add(i);
		}
	}

	public List<Integer> getProdutosFiltrados() {
		return this.produtosFiltrados;
	}
}
