package br.com.fiap.controller;

public class KitGasController {
	public double aplicaTaxa(String kitgas) {
		if (kitgas.equals("Sim")) {
			return 0.05;
		} else  {
			return 0.01;
		}
	}
}
