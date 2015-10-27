package br.com.bradseg.siaw.antecipaparcela.funcao.dao;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.bradseg.siaw.antecipaparcela.dao.AntecipaParcelaDao;
import br.com.bradseg.siaw.antecipaparcela.dao.AntecipaParcelaDaoImpl;

import br.com.bradseg.siaw.antecipaparcela.vo.EntradaParcelaVo;
import br.com.bradseg.siaw.antecipaparcela.vo.RetornoErroVo;
import br.com.bradseg.siaw.antecipaparcela.vo.SaidaParcelaVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/springTests.xml"})
public class AntecipaParcelaDaoTest {

	@Autowired
	AntecipaParcelaDao antecipaParcelaDao;

	private EntradaParcelaVo mock;
	
//	@Before
//	public void setup() {
//		// Criar mock do dao InicioDao.
//		mock = EasyMock.createMock(EntradaParcela.class);
//
//		// Utilizar o mock no servi�o InicioService.
//		antecipaParcelaDao.consultarAntecipacaoParcela(mock);
//	}
	
	@Test
	public void consultarAntecipacaoParcela(){
		
		SaidaParcelaVo saidaParcela = antecipaParcelaDao.consultarAntecipacaoParcela(preencherEntradaParcela());
	}
	
	private static EntradaParcelaVo preencherEntradaParcela(){
		
		EntradaParcelaVo entradaParcela = new EntradaParcelaVo();
		entradaParcela.setSucursal(1);
		entradaParcela.setRamo(990);
		entradaParcela.setCia(244);
		entradaParcela.setApolice(844556);
		entradaParcela.setItem(1);
		entradaParcela.setEndosso(00000000);
		entradaParcela.setNumeroPrestacao(1);
		entradaParcela.setValorParcela(new BigDecimal("100000"));
		entradaParcela.setPercentualJuros(new BigDecimal("250"));
		entradaParcela.setValorAdicionalFracionamento(new BigDecimal("2500"));
		entradaParcela.setValorIOF(new BigDecimal("2000"));
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); 
		try {
			entradaParcela.setDataVencimento((Date)format.parse("15/12/2015"));
			entradaParcela.setDataPagamento((Date)format.parse("15/10/2015"));
		} catch (ParseException e) {
			// TODO Bloco catch gerado automaticamente
			e.printStackTrace();
		}
		
		entradaParcela.setTipoCobranca(1);
		
		return entradaParcela;
	}
	
	public static void main(String[] args) {
		
		AntecipaParcelaDaoImpl antecipaParcelaDao = new AntecipaParcelaDaoImpl();
		
		SaidaParcelaVo saidaParcela = antecipaParcelaDao.consultarAntecipacaoParcela(preencherEntradaParcela());
		
		System.out.println(saidaParcela.getValorParcelaCalculado());
		System.out.println(saidaParcela.getValorIOFCalculado());
		System.out.println(saidaParcela.getDataVencimentoBoleto());		
		System.out.println(saidaParcela.getErro().getErro());
		System.out.println(saidaParcela.getErro().getMensagemErro());
	}
	
	
}
