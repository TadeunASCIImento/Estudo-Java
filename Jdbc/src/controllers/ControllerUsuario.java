package br.com.controllers;

import java.util.List;

import br.com.dao.DaoUsuario;
import br.com.entities.Entitie;
import br.com.entities.Usuario;

public class ControllerUsuario {

	public static boolean adicionarUsuario(Usuario usuario) {
		return new DaoUsuario().add(usuario);
	}

	public static boolean validarAcesso(String usuario, String senha) {
		return new DaoUsuario().validarUsuario(usuario, senha);

	}

	public static boolean excluirUsuario(int id) {
		return new DaoUsuario().delete(id);

	}

	public static Usuario buscarUsuario(int id) {
		return new DaoUsuario().findOne(id);

	}

	public static boolean atualizarUsuario(Entitie entitie) {
		return new DaoUsuario().update(entitie);

	}

	public static List<Entitie> listarUsuarios() {
		List<Entitie> listaUsuarios = new DaoUsuario().findAll();
		return listaUsuarios;
	}


}
