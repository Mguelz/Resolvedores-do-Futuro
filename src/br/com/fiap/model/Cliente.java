package br.com.fiap.model;

import java.sql.Date;

public class Cliente {
	private long cpf;
	private Date dataNascimento;
	private String nome;
	private String email;
	private String endereco;
	private String estadoCivil;
	private String genero;
	private String celular;
	private int tempoHabilitacao;

	public Cliente(long cpf, Date dataNascimento, String nome, String email, String endereco, String estadoCivil,
			String genero, String celular, int tempoHabilitacao) {

		this.cpf = cpf;
		this.dataNascimento = dataNascimento; //TODO Quando fazer amarração com telas colocar o método Date.ValueOf(String);
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.estadoCivil = estadoCivil;
		this.genero = genero;
		this.celular = celular;
		this.tempoHabilitacao = tempoHabilitacao;
	}

	public Cliente() {

	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public int getTempoHabilitacao() {
		return tempoHabilitacao;
	}

	public void setTempoHabilitacao(int tempoHabilitacao) {
		this.tempoHabilitacao = tempoHabilitacao;
	}

}