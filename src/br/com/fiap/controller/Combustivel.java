package br.com.fiap.controller;

public class Combustivel {
	public double aplicaTaxa(String combustivel) {
		if (combustivel.equals("flex")) {
			return 0.01025;
		} else if (combustivel.equals("gasolina")) {
			return 0.035;
		} else if (combustivel.equals("alcool")) {
			return 0.025;
		} else if (combustivel.equals("diesel")) {
			return 0.011;
		}
		return 0.0;
	}
}
