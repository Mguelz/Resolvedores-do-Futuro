package br.com.fiap.controller;

import br.com.fiap.model.Combustivel;

public class DieselController implements Combustivel {
	@Override
	public double aplicaTaxa(String combustivel) {
		// TODO Auto-generated method stub
		return 0.011;
	}
}
