package br.com.fiap.controller;

import br.com.fiap.model.EstadoCivil;

public class Viuvo implements EstadoCivil{

	@Override
	public double aplicaTaxaEstadoCivil(String estadoCivil) {
		return 0.0096; // TODO fazer taxa do estado civil viuvo
	}

}
