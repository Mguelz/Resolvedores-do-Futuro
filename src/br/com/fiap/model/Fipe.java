package br.com.fiap.model;

import java.sql.Date;

public class Fipe {
	private int id_veiculo;
	private String marca, modelo;
	private String anoModelo;
	private double precoMedio;

	public Fipe() {
	}

	public Fipe(int id_veiculo, int precoMedio, String marca, String modelo, String anoModelo) {
		this.id_veiculo = id_veiculo;
		this.precoMedio = precoMedio;
		this.marca = marca;
		this.modelo = modelo;
		this.anoModelo = anoModelo;
	}

	public int getId_veiculo() {
		return id_veiculo;
	}

	public void setId_veiculo(int id_veiculo) {
		this.id_veiculo = id_veiculo;
	}

	public double getPrecoMedio() {
		return precoMedio;
	}

	public void setPrecoMedio(double precoMedio) {
		this.precoMedio = precoMedio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

}
