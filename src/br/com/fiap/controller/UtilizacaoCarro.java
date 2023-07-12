package br.com.fiap.controller;

public class UtilizacaoCarro {
	public double aplicaTaxaUtilizacaoCarro(String utilizacaoCarro) {
		if (utilizacaoCarro.equals("Locomoção diária")) {
			return 0.05;
		} else if (utilizacaoCarro.equals("Locomoção até o trabalho")) {
			return 0.08;
		} else if (utilizacaoCarro.equals("Motorista de aplicativo")) {
			return 0.020;
		} else if (utilizacaoCarro.equals("Motorista de táxi")) {
			return 0.011;
		} else if (utilizacaoCarro.equals("PCD - Locomoção diária")) {
			return 0.011;
		} else if (utilizacaoCarro.equals("PCD - Exercício de trabalho")) {
			return 0.015;
		}
		return 0.0;
	}
}
