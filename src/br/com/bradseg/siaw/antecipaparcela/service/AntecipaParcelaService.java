package br.com.bradseg.siaw.antecipaparcela.service;

import br.com.bradseg.siaw.antecipaparcela.vo.EntradaParcelaVo;
import br.com.bradseg.siaw.antecipaparcela.vo.SaidaParcelaVo;

public interface AntecipaParcelaService {

	
	public SaidaParcelaVo consultarAntecipaParcela(EntradaParcelaVo entradaParcela);
	
	
}
