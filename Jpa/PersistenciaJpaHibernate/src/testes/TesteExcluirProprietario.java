package br.com.loja.testes;

import javax.swing.JOptionPane;

import br.com.loja.controllers.ControllerProprietario;

public class TesteExcluirProprietario {

	public static void main(String[] args) {

		ControllerProprietario controllerProprietario = new ControllerProprietario();

		if (controllerProprietario.excluirProprietario(1L))

			JOptionPane.showMessageDialog(null, "Exclusão OK!");
		else
			JOptionPane.showMessageDialog(null, "Erro ao excluír!");
	}

}
