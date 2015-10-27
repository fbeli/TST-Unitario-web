package br.com.workshop;

import static org.junit.Assert.*;

import java.io.File;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;
import br.com.bradseg.siaw.antecipaparcela.dao.AntecipaParcelaDao;
import br.com.bradseg.siaw.antecipaparcela.dao.AntecipaParcelaDaoImpl;
import br.com.bradseg.siaw.antecipaparcela.dao.AntecipaParcelaDaoImplRefatorado;
import br.com.bradseg.siaw.antecipaparcela.facade.AntecipaParcelaServiceFacade;
import br.com.bradseg.siaw.antecipaparcela.facade.AntecipaParcelaServiceFacadeImpl;
import br.com.bradseg.siaw.antecipaparcela.facade.InicioServiceFacade;
import br.com.bradseg.siaw.antecipaparcela.vo.SaidaParcelaVo;
import br.com.bradseg.siaw.antecipaparcela.webservice.InicioWebService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:test\\AppContext_Test.xml"})
public class TesteIntegracao {

	@Autowired
	AntecipaParcelaDao serviceDao;
	
	@Autowired
	AntecipaParcelaServiceFacadeImpl facade;
	
	
	@Test
	public void testaNada(){
	
		File file = new File("arquivoNovo.Apagar");
		System.out.println("testando o vento!");
		System.out.println(file.getAbsoluteFile());
		
		//retorna exception throwable
		serviceDao.consultarAntecipacaoParcela(null);
		
	}
	
	

	private InicioServiceFacade mock;

	private AntecipaParcelaDao antDaoMock;
	
	@Before
	public void setup() {
		
		// Criar mock do serviço funcionalidadeService.
		antDaoMock = EasyMock.createMock(AntecipaParcelaDaoImplRefatorado.class);

		// Utilizar o mock 
		//facade.setAntecipaParcelaDao(antDaoMock);
	}
	
	@Test
	public void testaAntecipaParcela(){
	
		//Preparo o cenário para a Mock
		EasyMock.expect(antDaoMock.consultarAntecipacaoParcela(CriarObjetos.getEntradaParcelaVo()))
			.andReturn(CriarObjetos.getSaidaParcelaVo());
		
		EasyMock.replay(antDaoMock);
		
		SaidaParcelaVo svo = facade.consultarAntecipaParcela(CriarObjetos.getEntradaParcelaVo());
		
		Assert.assertNotNull(svo.getErro());
		
		Assert.assertEquals(svo.getErro(), CriarObjetos.getSaidaParcelaVo());
		Assert.assertSame(svo, CriarObjetos.getSaidaParcelaVo());
		Assert.assertNotSame(svo, CriarObjetos.getSaidaParcelaVo());

	}

	
}
