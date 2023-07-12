package br.com.fiap.controller;

public class ModeloVeiculo {
	public double aplicaTaxaModeloVeiculo(String modeloVeiculo) {
		if (modeloVeiculo.equals("corolla")) {
			return 0.04;
		} else if (modeloVeiculo.equals("hb20")) {
			return 0.035;
		} else if (modeloVeiculo.equals("uno")) {
			return 0.030;
		} else if (modeloVeiculo.equals("jetta")) {
			return 0.036;
		} else if (modeloVeiculo.equals("onix")) {
			return 0.29;
		} else {
			return 0;
		}
	}
}
