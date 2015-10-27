package br.com.bradseg.siaw.antecipaparcela.service;

import java.util.List;

import br.com.bradseg.siaw.antecipaparcela.funcao.dao.jdbc.Pessoa;

public interface PessoaService {

	public List<Pessoa> getPessoas(String nome);
	
}
