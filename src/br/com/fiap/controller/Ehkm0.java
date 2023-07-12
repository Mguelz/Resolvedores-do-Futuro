package br.com.fiap.controller;

public class Ehkm0 {

	public double aplicaTaxaEh0Km(String eh0Km) {

		if (eh0Km.equals("sim")) {
			return 0.04;
		} else {
			return 0.01;
		}

	}
}
