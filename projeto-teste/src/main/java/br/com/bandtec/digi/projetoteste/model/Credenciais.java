package br.com.bandtec.digi.projetoteste.model;

public class Credenciais {
	
private String login;
private String senha;
	
	public Credenciais(String login, String senha) {
 this.login = login;
 this.senha = senha;
	}

	public boolean validar() {
		if(login.equals("login") && senha.equals("senha")) {
			return true;
		}
		return false;
	}

}
