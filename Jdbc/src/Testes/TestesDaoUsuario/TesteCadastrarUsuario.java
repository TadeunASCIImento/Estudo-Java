package br.com.teste;

import javax.swing.JOptionPane;

import br.com.controllers.ControllerUsuario;
import br.com.entities.Usuario;

public class TesteCadastrarUsuario extends ControllerUsuario {

	public static void main(String[] args) {

		Usuario usuario = new Usuario("José", "111.222.333-44", "user", "password");

		if (cadastrarUsuario(usuario))

			JOptionPane.showMessageDialog(null, "Cadastro realizado");
		else
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário");

	}

}
