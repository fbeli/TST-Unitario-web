package br.com.bradseg.siaw.antecipaparcela.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.bradseg.siaw.antecipaparcela.funcao.dao.jdbc.JDBCPessoa;
import br.com.bradseg.siaw.antecipaparcela.funcao.dao.jdbc.Pessoa;

public class PessoaServiceImpl implements  PessoaService{

	//@Autowired
	JDBCPessoa daoPessoa;
	
	public PessoaServiceImpl()  {
		// TODO Stub de compilador gerado automaticamente
	}

	
	

	@Override
	public List<Pessoa> getPessoas(String nome) {
		return daoPessoa.getPessoas(nome);
	}

}
