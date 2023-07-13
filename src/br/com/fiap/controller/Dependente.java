package br.com.fiap.controller;

public class Dependente {
	public double aplicaTaxa(String dependente) {
		if (dependente.equals("Masculino")) {
			return 0.0025;
		} else if (dependente.equals("Feminino")) {
			return 0.002;
		} else if (dependente.equals("Não")) {
			return 0.001;
		} else {
			return 0.0;
		}
	}
}
