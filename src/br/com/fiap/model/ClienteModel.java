package br.com.fiap.model;

import java.sql.Date;

public class ClienteModel {
//	private long cpf;
//	private int idCorretor;
//	private Date dataNascimento; // Quando fazer amarração com telas colocar o método Date.ValueOf(String);
//	private String nome;
//	private String email;
//	private String estado;
//	private String genero;
//	private String celular;
//	private int tempoHabilitacao;
//	
	private long cpf;
	private String nomeCliente;
	private int corretorId;
	private Date dataNascimento; // Quando fazer amarração com telas colocar o método Date.ValueOf(String);
	private String email;
	private String estado;
	private String genero;
	private int tempoHabilitacao;
	private int dependente;
	private String estadoCivil;

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public ClienteModel() {
	}

	public ClienteModel(long cpf, String nomeCliente, int corretorId, Date dataNascimento, String email,
			String estado, String genero, int tempoHabilitacao, int dependente, String estadoCivil) {
		this.cpf = cpf;
		this.nomeCliente = nomeCliente;
		this.corretorId = corretorId;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.estado = estado;
		this.genero = genero;
		this.tempoHabilitacao = tempoHabilitacao;
		this.dependente = dependente;
		this.estadoCivil = estadoCivil;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCorretorId() {
		return corretorId;
	}

	public void setCorretorId(int corretorId) {
		this.corretorId = corretorId;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getTempoHabilitacao() {
		return tempoHabilitacao;
	}

	public void setTempoHabilitacao(int tempoHabilitacao) {
		this.tempoHabilitacao = tempoHabilitacao;
	}

	public int getDependente() {
		return dependente;
	}

	public void setDependente(int dependente) {
		this.dependente = dependente;
	}

}