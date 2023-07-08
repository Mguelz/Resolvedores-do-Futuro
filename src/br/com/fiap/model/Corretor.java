package br.com.fiap.model;

public class Corretor {

	private int id;
	private String nome;
	private String endereco;
	private String celular;
	private Especialidade especialidade;

	public Corretor() {
	}

	public Corretor(int id, String nome, String endereco, String celular, Especialidade especialidade) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.celular = celular;
		this.especialidade = especialidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

}