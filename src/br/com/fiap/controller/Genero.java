package br.com.fiap.controller;

public class Genero {

	public double AplicaTaxaGenero(String genero) {
		
		if(genero.equals("masculino")) {
			return 0.01;
		} else {
			return 0.0095; 
		}
	}

}
