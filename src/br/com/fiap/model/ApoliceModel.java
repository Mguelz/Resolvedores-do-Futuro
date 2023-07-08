package br.com.fiap.model;

import java.sql.Date;

public class ApoliceModel {

	private long idApolice;
	private Date dataEmissao;
	private double valorPremio;
	private String chassi;
	private long cpfCliente;
	private long idVeiculo;

	public ApoliceModel(long idApolice, Date dataEmissao, double valorPremio, String chassi, long cpfCliente,
			long idVeiculo) {
		this.idApolice = idApolice;
		this.dataEmissao = dataEmissao;
		this.valorPremio = valorPremio;
		this.chassi = chassi;
		this.cpfCliente = cpfCliente;
		this.idVeiculo = idVeiculo;
	}

	public ApoliceModel() {

	}

	public long getIdApolice() {
		return idApolice;
	}

	public void setIdApolice(long idApolice) {
		this.idApolice = idApolice;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public double getValorPremio() {
		return valorPremio;
	}

	public void setValorPremio(double valorPremio) {
		this.valorPremio = valorPremio;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public long getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(long cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public long getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(long idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

}