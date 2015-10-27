package br.com.bradseg.siaw.antecipaparcela.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.bradseg.siaw.antecipaparcela.dao.AntecipaParcelaDao;
import br.com.bradseg.siaw.antecipaparcela.util.Validacao;
import br.com.bradseg.siaw.antecipaparcela.vo.EntradaParcelaVo;
import br.com.bradseg.siaw.antecipaparcela.vo.RetornoErroVo;
import br.com.bradseg.siaw.antecipaparcela.vo.SaidaParcelaVo;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class AntecipaParcerlaServiceImpl implements AntecipaParcelaService {

	@Autowired(required = true)
	private AntecipaParcelaDao antecipaParcelaDao;

	@Autowired(required = true)
	private Validacao validacao;

	@Override
	public SaidaParcelaVo consultarAntecipaParcela(
			EntradaParcelaVo entradaParcela) {

		RetornoErroVo retornoErroVo = null;

		// RetornoErroVo retornoErroVo = validacao.validarDados(entradaParcela);

		if (retornoErroVo == null) {
			SaidaParcelaVo saida = antecipaParcelaDao
					.consultarAntecipacaoParcela(entradaParcela);

			BigDecimal bd =  new BigDecimal(saida.getValorParcelaCalculado().longValue()*2);
			saida.setValorParcelaCalculado(bd);

			return saida;
		} else {
			SaidaParcelaVo saidaParcela = new SaidaParcelaVo();
			saidaParcela.setErro(retornoErroVo);
			return saidaParcela;
		}
	}

	public void setAntecipaParcelaDao(AntecipaParcelaDao antecipaParcelaDao) {
		this.antecipaParcelaDao = antecipaParcelaDao;
	}

	public void setValidacao(Validacao validacao) {
		this.validacao = validacao;
	}

}
