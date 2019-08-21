package br.untins.cadastro.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.unitins.cadastro.application.Util;
import br.untins.cadastro.controller.CadastroUsuarioController;

import br.unitins.cadastro.model.*;
@Named
@RequestScoped
public class LoginController {
	private Cadastro cadastro;
	
	
	public String logar() {
		if (getCadastro().getLogin().equals("teste")
				&& getCadastro().getSenha().equals("123")) {
			System.out.println(getCadastro().getLogin());
			System.out.println(getCadastro().getSenha());
			return "login.xhtml?faces-redirect=true";
		}
		Util.addMessageError("Usuário ou Senha Inválido.");
		return null;
	}
	public void limpar() {
		setCadastro(new Cadastro());
	}
	

	public Cadastro getCadastro() {
		if (cadastro == null)
			cadastro = new Cadastro();
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
	
	
	
}
