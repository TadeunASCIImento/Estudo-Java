package br.com.testes;

import javax.swing.JOptionPane;

import br.com.controllers.ControllerUsuario;
import br.com.entities.Usuario;

public class TesteAtualizarUsuario extends ControllerUsuario {

	public static void main(String[] args) {

		Usuario usuario = new Usuario();

		usuario.setId(10);
		usuario.setNome("José da Silva");
		usuario.setCpf("222.333.444-55");
		usuario.setUsuario("usuárioZé");
		usuario.setSenha("senhaZé");

		if (atualizarUsuario(usuario)) {

			JOptionPane.showMessageDialog(null, "Usuário atualizado com Sucesso.");
		} else {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar dados do usuário");
		}

	}

}
