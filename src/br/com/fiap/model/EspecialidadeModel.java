package br.com.fiap.model;

public class EspecialidadeModel {
	private int nr_codigo;
	private String nm_especialidade;

	public EspecialidadeModel() {
	}

	public EspecialidadeModel(int cd_especialidade, String nome_especialidade) {
		this.nr_codigo = cd_especialidade;
		this.nm_especialidade = nome_especialidade;
	}

	public int getNr_codigo() {
		return nr_codigo;
	}

	public void setNr_codigo(int cd_especialidade) {
		this.nr_codigo = cd_especialidade;
	}

	public String getNm_especialidade() {
		return nm_especialidade;
	}

	public void setNm_especialidade(String nome_especialidade) {
		this.nm_especialidade = nome_especialidade;
	}

}
