package br.com.fiap.controller;

public class EscolhaSeguro {

	public double aplicaTaxaEscolhaSeguro(String tipoSeguro) {

		if (tipoSeguro.equals("Perda Total Por Colisão")) {
			return 0.03733;
		} else if (tipoSeguro.equals("Roubo e Furtos")) {
			return 0.01378;
		} else if (tipoSeguro.equals("Compreensivo Total")) {
			return 0.1723;
		} else {
			return 0.0;
		}
	}
}