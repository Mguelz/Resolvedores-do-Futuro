package br.com.fiap.controller;

import br.com.fiap.model.Combustivel;

public class FlexController implements Combustivel {
	@Override
	public double aplicaTaxa(String combustivel) {
		// TODO Auto-generated method stub
		return 0.01025;
	}
}
