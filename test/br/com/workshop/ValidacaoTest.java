package br.com.workshop;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.bradseg.siaw.antecipaparcela.util.Validacao;
import br.com.bradseg.siaw.antecipaparcela.vo.EntradaParcelaVo;
import br.com.bradseg.siaw.antecipaparcela.vo.RetornoErroVo;

public class ValidacaoTest {
	private Validacao validacao;
	private EntradaParcelaVo entradaVO;
	private RetornoErroVo retornoVO;

	@Before
	public void beforeTestes() {
		this.validacao = new Validacao();
		this.entradaVO = null;
	}

	@Test
	public void testValidarDadosNull() {
		retornoVO = validacao.validarDados(entradaVO);
		Assert.assertNotNull("RetornoVO está nulo, mas não deveria estar. Falta mensagem de \"Dados não Informados\".", retornoVO);
	}

	@Test
	public void testValidarDadosEntradaVazia() {
		this.entradaVO = new EntradaParcelaVo();
		retornoVO = validacao.validarDados(entradaVO);
		Assert.assertNotNull("RetornoVO não está nulo, mas deveria estar.", retornoVO);
		Assert.assertTrue("Não há mensagens de retorno. Erro.", !retornoVO.getMensagemErro().equals(""));
		Assert.assertEquals("Valor de erro inválido.", 77, retornoVO.getErro().intValue());
	}

	@Test
	public void testValidarDadosEntradaNaoVazia() {
		this.entradaVO = new EntradaParcelaVo();
		this.entradaVO.setDataPagamento(new Date());
		this.entradaVO.setDataVencimento(new Date());

		retornoVO = validacao.validarDados(entradaVO);
		
		Assert.assertNotNull("RetornoVO está nulo, mas não deveria estar.", retornoVO);
		Assert.assertTrue("Não há mensagens de retorno. Deveria ter.", !retornoVO.getMensagemErro().equals(""));
		System.out.println(" Mensagens de Erro: \n" + retornoVO.getMensagemErro());
	}
}
