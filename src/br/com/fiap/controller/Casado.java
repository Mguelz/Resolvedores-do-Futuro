package br.com.fiap.controller;

import br.com.fiap.model.EstadoCivil;

public class Casado implements EstadoCivil{

	@Override
	public double aplicaTaxaEstadoCivil(String estadoCIvil) {
		return 0.0095; // TODO fazer taxa do estado civil casado
	}

}
