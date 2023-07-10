package br.com.fiap.controller;

import br.com.fiap.model.Estado;

public class SaoPauloController implements Estado {

	@Override
	public double selecionaEstado(String estado) {
		return 0.04;
	}
}
