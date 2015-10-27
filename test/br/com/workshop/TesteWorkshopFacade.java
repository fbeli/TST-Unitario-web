package br.com.workshop;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.staticmock.MockStaticEntityMethods;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.bradseg.siaw.antecipaparcela.dao.AntecipaParcelaDao;
import br.com.bradseg.siaw.antecipaparcela.dao.AntecipaParcelaDaoImpl;
import br.com.bradseg.siaw.antecipaparcela.dao.AntecipaParcelaDaoImplRefatorado;
import br.com.bradseg.siaw.antecipaparcela.facade.AntecipaParcelaServiceFacadeImpl;
import br.com.bradseg.siaw.antecipaparcela.facade.InicioServiceFacade;
import br.com.bradseg.siaw.antecipaparcela.service.AntecipaParcerlaServiceImpl;
import br.com.bradseg.siaw.antecipaparcela.vo.EntradaParcelaVo;
import br.com.bradseg.siaw.antecipaparcela.vo.SaidaParcelaVo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:test\\AppContext_Test.xml"})
public class TesteWorkshopFacade {
	
	@Autowired
	AntecipaParcelaDao serviceDao;
	
	@Autowired
	AntecipaParcelaServiceFacadeImpl facade;

	@Autowired
	AntecipaParcerlaServiceImpl service;


	private InicioServiceFacade mock;

	private AntecipaParcelaDao antDaoMock;

	@Before
	public void setup() {
		
		// Informo que o DAO agora é uma classe do EasyMock
		antDaoMock = EasyMock.createMock(AntecipaParcelaDao.class);

		//Instancio o Mock no Serviço
		service.setAntecipaParcelaDao(antDaoMock);
		
		facade.setAntecipaParcelaService(service);
	}

	@Test
	public void testaAntecipaParcela(){
	
		EntradaParcelaVo entradaVo = CriarObjetos.getEntradaParcelaVo();
		SaidaParcelaVo saidaVo = CriarObjetos.getSaidaParcelaVo();
		
		System.out.println(saidaVo.getValorParcelaCalculado()+"");
		//Informo que quando solicitar o método a resposta é a que quero.
		EasyMock.expect(antDaoMock.consultarAntecipacaoParcela(entradaVo))
			.andReturn(saidaVo);
		
		EasyMock.replay(antDaoMock);
		
		SaidaParcelaVo svo = facade.consultarAntecipaParcela(entradaVo);
		
		System.out.println(svo.getValorParcelaCalculado()+"");
		System.out.println("teste executado");
		
	}


}
