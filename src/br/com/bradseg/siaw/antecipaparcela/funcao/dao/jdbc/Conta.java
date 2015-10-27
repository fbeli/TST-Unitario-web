package br.com.bradseg.siaw.antecipaparcela.funcao.dao.jdbc;

public class Conta {

	private int id;
	private int conta;
	private float saldo;
	private int numero;
	
	
	public Conta() {
	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getConta() {
		return conta;
	}


	public void setConta(int conta) {
		this.conta = conta;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}

}
