package br.com.fiap.model;

import java.sql.Date;

public class Veiculo {
	String numeroChassi, placa, modelo;
	Boolean carroZero;
	String dataFabricacao, fabricante, combustivel;
	byte garagem;
	Boolean isencao, kitgas;
	String utilizacao;
	
	public Veiculo(String numeroChassi, String placa, String modelo, Boolean carroZero, String dataFabricacao,
			String fabricante, String combustivel, byte garagem, Boolean isencao, Boolean kitgas, String utilizacao) {
		this.numeroChassi = numeroChassi;
		this.placa = placa;
		this.modelo = modelo;
		this.carroZero = carroZero;
		this.dataFabricacao = dataFabricacao;
		this.fabricante = fabricante;
		this.combustivel = combustivel;
		this.garagem = garagem;
		this.isencao = isencao;
		this.kitgas = kitgas;
		this.utilizacao = utilizacao;
	}

	public Veiculo() {
		
	}

	public String getNumeroChassi() {
		return numeroChassi;
	}

	public void setNumeroChassi(String numeroChassi) {
		this.numeroChassi = numeroChassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Boolean getCarroZero() {
		return carroZero;
	}

	public void setCarroZero(Boolean carroZero) {
		this.carroZero = carroZero;
	}

	public String getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public byte getGaragem() {
		return garagem;
	}

	public void setGaragem(byte garagem) {
		this.garagem = garagem;
	}

	public Boolean getIsencao() {
		return isencao;
	}

	public void setIsencao(Boolean isencao) {
		this.isencao = isencao;
	}

	public Boolean getKitgas() {
		return kitgas;
	}

	public void setKitgas(Boolean kitgas) {
		this.kitgas = kitgas;
	}

	public String getUtilizacao() {
		return utilizacao;
	}

	public void setUtilizacao(String utilizacao) {
		this.utilizacao = utilizacao;
	}

	
	
}
