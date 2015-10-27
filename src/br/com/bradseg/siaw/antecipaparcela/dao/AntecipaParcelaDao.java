package br.com.bradseg.siaw.antecipaparcela.dao;

import br.com.bradseg.siaw.antecipaparcela.vo.EntradaParcelaVo;
import br.com.bradseg.siaw.antecipaparcela.vo.SaidaParcelaVo;

public interface AntecipaParcelaDao {

	public SaidaParcelaVo consultarAntecipacaoParcela(EntradaParcelaVo entradaParcela);
	
}
