package br.com.fiap.controller;

import br.com.fiap.model.UtilizacaoCarro;

public class PcdTrabalho implements UtilizacaoCarro {
	@Override
	public double aplicaTaxaUtilizacaoCarro(String utilizacaoCarro) {
		return 0.085;
	}
}
