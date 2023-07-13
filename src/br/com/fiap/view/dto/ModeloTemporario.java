package br.com.fiap.view.dto;

import java.sql.Date;

public class ModeloTemporario {
	
	private String nome;
	private String email;
	private String senha;
	private String cpf;
	private String celular;
	private Date dataNascimento;
	private String regiao;
	private String esCivil;
	private String sexo;
	private String tempCnh;
	
	
	public ModeloTemporario() {
		
	}
	public ModeloTemporario(String nome, String email, String senha, String cpf, String celular, Date dataNascimento, String regiao, String esCivil, String sexo,String tempCnh ) {
		
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
		this.celular = celular;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.tempCnh = tempCnh;
		this.esCivil = esCivil;
		
	}
	
	public void salvar(String nome, String email, String senha) {
	        this.setNome(nome);
	        this.setEmail(email);
	        this.setSenha(senha);
	        System.out.println("Nome: " + nome + " Email: " + email + " Senha: " + senha);
	    }

	    public void salvar2( String cpf, String celular, Date dataNascimento) {
	        this.cpf = cpf;
	        this.celular = celular;
	        this.dataNascimento = dataNascimento;
	       // setNome().get
	        System.out.println(nome +"CPF: " + cpf + " Celular: " + celular + " Data de Nascimento: " + dataNascimento);
	    }

	    public void salvar3 (String esCivil, String regiao, String sexo, String tempCnh) {
	        this.esCivil = esCivil;
	        this.regiao = regiao;
	        this.sexo = sexo;
	        this.tempCnh = tempCnh;
	        System.out.println("Nome: " + nome + " Email: "+email+" Senha: "+ senha+ " Cpf: "+cpf+" Celular: "+celular+" Data de nascimento: " + dataNascimento+ " Estado Civil: "+esCivil+" Regiao: "+regiao+" Sexo: "+sexo+" Tempo de cnh: "+tempCnh);
	    }
	
	public void executar() {
		System.out.println("Nome: " + nome + " Email: "+email+" Senha: "+ senha+ " Cpf: "+cpf+" Celular: "+celular+" Data de nascimento: " + dataNascimento+ " Estado Civil: "+esCivil+" Regiao: "+regiao+" Sexo: "+sexo+" Tempo de cnh: "+tempCnh);
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getEsCivil() {
		return esCivil;
	}
	public void setEsCivil(String esCivil) {
		this.esCivil = esCivil;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTempCnh() {
		return tempCnh;
	}
	public void setTempCnh(String tempCnh) {
		this.tempCnh = tempCnh;
	}
}
