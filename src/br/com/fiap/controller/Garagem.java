package br.com.fiap.controller;

public class Garagem {

public double AplicaTaxaGaragem(String garagem) {
		
		if(garagem.equals("Exclusivamente na residencia")) {
			return 0.02;
		} else if(garagem.equals("Exclusivamente no trabalho")) {
			return 0.03;
		} else if(garagem.equals("Residencia e trabalho")) {
			return 0.01;
	    } else if(garagem.equals("Garagem paga")) {
			return 0.015; 
	    } else {
	    	return 0.5;}
	    }
}
