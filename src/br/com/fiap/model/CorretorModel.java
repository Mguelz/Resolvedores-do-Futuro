package br.com.fiap.model;

public class CorretorModel {

	private int id;
	private String nome;
	private String endereco;
	private String celular;
	private EspecialidadeModel especialidade;

	public CorretorModel() {
	}

	public CorretorModel(int id, String nome, String endereco, String celular, EspecialidadeModel especialidade) {
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

	public EspecialidadeModel getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(EspecialidadeModel especialidade) {
		this.especialidade = especialidade;
	}

}