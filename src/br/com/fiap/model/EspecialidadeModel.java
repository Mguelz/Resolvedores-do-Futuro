package br.com.fiap.model;

public class EspecialidadeModel {
	private int cd_especialidade;
	private String nm_especialidade;

	public EspecialidadeModel() {
	}

	public EspecialidadeModel(int cd_especialidade, String nome_especialidade) {
		this.cd_especialidade = cd_especialidade;
		this.nm_especialidade = nome_especialidade;
	}

	public int getCd_especialidade() {
		return cd_especialidade;
	}

	public void setCd_especialidade(int cd_especialidade) {
		this.cd_especialidade = cd_especialidade;
	}

	public String getNm_especialidade() {
		return nm_especialidade;
	}

	public void setNm_especialidade(String nome_especialidade) {
		this.nm_especialidade = nome_especialidade;
	}

}
