package br.com.fiap.controller;

import br.com.fiap.model.EstadoCivil;

public class Separado implements EstadoCivil {
	@Override
	public double aplicaTaxaEstadoCivil(String estadoCivil) {
		return 0.0; // TODO fazer taxa do estado civil separado
	}
}
