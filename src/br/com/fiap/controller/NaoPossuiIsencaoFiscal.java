package br.com.fiap.controller;

import br.com.fiap.model.IsencaoFiscal;

public class NaoPossuiIsencaoFiscal implements IsencaoFiscal {

	@Override
	public double taxaIsencaiFiscal(String possuiIsencaoFiascal) {
		return 0.05;
	}

}
