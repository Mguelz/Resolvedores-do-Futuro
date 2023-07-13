package br.com.fiap.controller;

public class TempoCnh {

	public double aplicaTaxa(String tempo) {
		if (tempo.equals("mais que dois anos")) {
			return 0.0011;
		} else {
			return 0.0095;
		}
	}

}
