package br.com.fiap.controller;

public class EstadoCivil {
	public double aplicaTaxaEstadoCivil(String estadoCivil) {
		if (estadoCivil.equals("divorciado")) {
			return 0.0098;
		} else if (estadoCivil.equals("Solteiro(a)")) {
			return 0.0089;
		} else if (estadoCivil.equals("Casado(a)")) {
			return 0.0065;
		} else if (estadoCivil.equals("Separado(a)")) {
			return 0.008;
		} else if (estadoCivil.equals("União Estável")) {
			return 0.003;
		} else if (estadoCivil.equals("Viúvo(a)")) {
			return 0.0026;
		}
		return 0.000;
	}
}
