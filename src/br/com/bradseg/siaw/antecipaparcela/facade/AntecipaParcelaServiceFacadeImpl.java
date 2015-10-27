package br.com.bradseg.siaw.antecipaparcela.facade;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.bradseg.siaw.antecipaparcela.dao.AntecipaParcelaDao;
import br.com.bradseg.siaw.antecipaparcela.service.AntecipaParcelaService;
import br.com.bradseg.siaw.antecipaparcela.util.Validacao;
import br.com.bradseg.siaw.antecipaparcela.vo.EntradaParcelaVo;
import br.com.bradseg.siaw.antecipaparcela.vo.RetornoErroVo;
import br.com.bradseg.siaw.antecipaparcela.vo.SaidaParcelaVo;

/**
 * Descrição do serviço
 * 
 * @author Rafael Francisco
 */
@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class AntecipaParcelaServiceFacadeImpl implements AntecipaParcelaServiceFacade {

	@Autowired(required=true)
	private AntecipaParcelaService antecipaParcelaService;
	
	@Autowired(required=true)
	private Validacao validacao;
	
	public SaidaParcelaVo consultarAntecipaParcela(EntradaParcelaVo entradaParcela){
		
		RetornoErroVo retornoErroVo = null;//validacao.validarDados(entradaParcela);
		
		if (retornoErroVo == null){
			
			SaidaParcelaVo saida = antecipaParcelaService.consultarAntecipaParcela(entradaParcela);
		
			
			BigDecimal bd =  new BigDecimal(saida.getValorParcelaCalculado().longValue()*2);
			saida.setValorParcelaCalculado(bd);
			
			
			return saida;
			
		}else{
			
			SaidaParcelaVo saidaParcela = new SaidaParcelaVo();
			saidaParcela.setErro(retornoErroVo);
			return saidaParcela;
		
		}
	}

	public void setAntecipaParcelaService(
			AntecipaParcelaService antecipaParcelaService) {
		this.antecipaParcelaService = antecipaParcelaService;
	}

	
}
