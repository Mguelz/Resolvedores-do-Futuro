package br.com.fiap.controller;

public class IsencaoFiscal {

	public double aplicaTaxaIsencaiFiscal(String possuiIsencaoFiascal) {
		if (possuiIsencaoFiascal.equals("sim")) {
			return 0.005;
		} else if(possuiIsencaoFiascal.equals("Não")){
			return 0.003;
		}
		return 0.0;
	}

}
