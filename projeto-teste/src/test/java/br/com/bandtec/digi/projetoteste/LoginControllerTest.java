package br.com.bandtec.digi.projetoteste;

import org.junit.Test;
import org.mockito.Mockito;

import br.com.bandtec.digi.projetoteste.controller.LoginController;
import br.com.bandtec.digi.projetoteste.model.Credenciais;
import org.junit.Assert;

public class LoginControllerTest {
	private LoginController controller;
	@Test
	public void efetuarLoginPorCredenciaisSucesso() {
		controller = new LoginController();
		Credenciais credenciais = new Credenciais("login", "senha");
		//credenciais.validar();
	    controller.efetuarLogin(credenciais);
	    Assert.assertEquals("PaginaPrincipal", "site");
	    
	}


}
