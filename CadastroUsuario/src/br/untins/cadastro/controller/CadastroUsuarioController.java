package br.untins.cadastro.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.unitins.cadastro.model.*;

@Named
@RequestScoped
public class CadastroUsuarioController {
	private Cadastro cadastro = new Cadastro();
	
	public void inserirDados() {
		System.out.println(getCadastro().getNome());
		System.out.println(getCadastro().getLogin());
		System.out.println(getCadastro().getSenha());
		System.out.println(getCadastro().getAtivo());
	}
	
	public void limpar() {
		setCadastro(new Cadastro());
	}
	
	public String redirecionarPagina() {
		return "Menu.xhtml?faces-redirect=true";
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
