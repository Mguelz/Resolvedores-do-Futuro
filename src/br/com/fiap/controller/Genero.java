package br.com.fiap.controller;

public class Genero {

	public double AplicaTaxaGenero(String genero) {

		if (genero.equals("masculino")) {
			return 0.006;
		} else if (genero.equals("feminino")) {
			return 0.0045;
		} else if (genero.equals("outros")) {
			return 0.035;
		} else if (genero.equals("prefiro nao informar")) {
			return 0.035;
		}
		return 0.00;
	}

}
