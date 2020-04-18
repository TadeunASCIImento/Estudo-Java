package br.com.testes;

import javax.swing.JOptionPane;

import br.com.controllers.ControllerUsuario;
import br.com.entities.Usuario;

public class TesteBuscarUsuario extends ControllerUsuario {

	public static void main(String[] args) {

		Integer idUsuario = Integer.parseInt(JOptionPane.showInputDialog("Informe o id do usuário?"));

		Usuario usuario = buscarUsuario(idUsuario);

		if (usuario.getId() == null)

			JOptionPane.showMessageDialog(null, "Usuario não localizado");
		else
			JOptionPane.showMessageDialog(null, usuario.toString());
	}

}
