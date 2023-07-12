package br.com.fiap.controller;

public class KitGasController {
	public double aplicaTaxa(String kitgas) {
		if (kitgas.equals("Sim")) {
			return 0.005;
		} else  if(kitgas.equals("Não")){
			return 0.001;
		}
		return 0.0;
	}
}
