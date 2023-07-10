package br.com.fiap.controller;

import br.com.fiap.model.IsencaoFiscal;

public class PossuiIsencaoFiscal implements IsencaoFiscal {

	@Override
	public double taxaIsencaiFiscal(String possuiIsencaoFiascal) {
		return 0.01;
	}

}
