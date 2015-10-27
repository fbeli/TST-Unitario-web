package br.com.bradseg.siaw.antecipaparcela.funcao.dao.jdbc;

public class Pessoa {

	private String nome;
	private int id;
	private String cpf;
	
	
	
	
	
	public Pessoa() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
