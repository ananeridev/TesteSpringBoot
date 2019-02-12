package br.com.bandtec.digi.projetoteste.controller;

import br.com.bandtec.digi.projetoteste.model.Credenciais;

public class LoginController {

	public String  efetuarLogin(Credenciais credenciais) {
		if(credenciais.validar() == true) {
			return "PaginaPrincipal";
		}else {
			return "site";
		}
	
		
	}
	
}
