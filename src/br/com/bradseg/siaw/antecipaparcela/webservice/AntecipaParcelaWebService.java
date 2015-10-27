package br.com.bradseg.siaw.antecipaparcela.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bradseg.bsad.framework.core.exception.BusinessException;
import br.com.bradseg.bsad.framework.core.exception.IntegrationException;
import br.com.bradseg.siaw.antecipaparcela.facade.AntecipaParcelaServiceFacade;
import br.com.bradseg.siaw.antecipaparcela.vo.EntradaParcelaVo;

import br.com.bradseg.siaw.antecipaparcela.vo.SaidaParcelaVo;

/**
 * Documentação da classe que representa um WebService da funcionalidade
 * 
 * @author Rafael de Jesus
 */
@WebService
@Service
public class AntecipaParcelaWebService {
	
	@Autowired
	private AntecipaParcelaServiceFacade antecipaParcelaServiceFacade; 
	
	/**
	 * Documentação do método
	 * 
	 * @param nome do argumento
	 * @return String
	 */
	@WebMethod
	public SaidaParcelaVo consultarParcela (EntradaParcelaVo entradaParcela) throws IntegrationException, BusinessException {
		return antecipaParcelaServiceFacade.consultarAntecipaParcela(entradaParcela); 
	}
	

}
