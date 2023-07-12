package br.com.fiap.controller;

public class Estado {

	public double aplicaTaxa(String estado) {
		if (estado.equals("bahia")) {
			return 0.025;
		} else if (estado.equals("São Paulo")) {
			return 0.01;
		} else if (estado.equals("Rio de Janeiro")) {
			return 0.02;
		} else if (estado.equals("Goiás")) {
			return 0.0375;
		} else if (estado.equals("Minas Gerais")) {
			return 0.024;
		} else {
			return 0.0;
		}
	}

}
