package br.com.fiap.model;

import java.sql.Date;

public class Apolice {

	private long idApolice;
	private Date dataEmissao;
	private double valorSeguro;

	public Apolice(long idApolice, Date dataEmissao, double valorSeguro) {

		this.idApolice = idApolice;
		this.dataEmissao = new Date(System.currentTimeMillis());
		this.valorSeguro = valorSeguro;
	}

	public Apolice() {

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

	public double getValorSeguro() {
		return valorSeguro;
	}

	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
}