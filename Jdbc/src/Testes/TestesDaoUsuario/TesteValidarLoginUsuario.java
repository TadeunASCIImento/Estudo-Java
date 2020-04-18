package br.com.testes;

import javax.swing.JOptionPane;

import br.com.controllers.ControllerUsuario;

public class TesteValidarLoginUsuario extends ControllerUsuario {

	public static void main(String[] args) {

		if (validarLoginUsuario("user", "password"))

			JOptionPane.showMessageDialog(null, "Acesso Liberado");
		else
			JOptionPane.showMessageDialog(null, "Acesso Negado");

	}

}
