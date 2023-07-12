package br.com.fiap.controller;

public class ModeloCarro {
	public double aplicaTaxaModeloCarro(String modelo) {
		if (modelo.equals("Fiat")) {
			return 25_000; // o _ indica onde o ponto vai, e consecutivamente onde a virgula 
		} else if (modelo.equals("Toyota")) {
			return 60_000;
		} else if (modelo.equals("Chevrolet")) {
			return 40_000;
		} else if (modelo.equals("Honda")) {
			return 50_000;
		} else if (modelo.equals("Volkswagen")) {
			return 55_000;
		} else {
			return 00_000;
		}
	}
}
