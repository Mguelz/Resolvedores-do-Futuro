package br.com.fiap.controller;

import br.com.fiap.model.EstadoCivil;

public class UniaoEstavel implements EstadoCivil {
	@Override
	public double aplicaTaxaEstadoCivil(String estadoCivil) {
		return 0.0097; // TODO fazer taxa do estado civil uniao estavel
	}
}
