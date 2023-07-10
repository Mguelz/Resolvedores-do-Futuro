package br.com.fiap.controller;

import br.com.fiap.model.ModeloVeiculo;

public class Onix implements ModeloVeiculo {
	@Override
	public double aplicaTaxaModeloVeiculo(String modeloVeiculo) {
		return 0.0095;
	}
}
