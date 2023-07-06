package br.com.fiap.model;

public class Corretor {
	private long idCorretor;
	private String nome;
	private String endereco;

	public Corretor(long idCorretor, String nome, String endereco) {
		this.idCorretor = idCorretor;
		this.nome = nome;
		this.endereco = endereco;
	}

	public Corretor() {

	}

	public long getIdCorretor() {
		return idCorretor;
	}

	public void setIdCorretor(long idCorretor) {
		this.idCorretor = idCorretor;
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
}