package br.com.fiap.controller;

import br.com.fiap.model.EstadoCivil;

public class Solteiro implements EstadoCivil {

	@Override
	public double aplicaTaxaEstadoCivil(String estadoCivil) {
		return 0.01; // TODO fazer taxa do estado civil solteiro
	}

}
