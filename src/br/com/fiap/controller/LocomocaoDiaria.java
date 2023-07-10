package br.com.fiap.controller;

import br.com.fiap.model.UtilizacaoCarro;

public class LocomocaoDiaria implements UtilizacaoCarro {
	@Override
	public double aplicaTaxaUtilizacaoCarro(String utilizacaoCarro) {
		return 0.015;
	}
}
