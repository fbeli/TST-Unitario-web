package br.com.workshop;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:test\\AppContext_Test.xml"})
public class TesteIntegracaoDao {

	public TesteIntegracaoDao() {
		// TODO Stub de compilador gerado automaticamente
	}

}
