package br.com.fiap.controller;

import br.com.fiap.model.EstadoCivil;

public class Divorciado implements EstadoCivil {
	@Override
	public double aplicaTaxaEstadoCivil(String estadoCivil) {
		return 0.0098; // TODO fazer taxa do estado civil divorciado
	}
}
