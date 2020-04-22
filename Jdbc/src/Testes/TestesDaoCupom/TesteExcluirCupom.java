package br.com.testes;

import javax.swing.JOptionPane;

import br.com.controllers.ControllerCupom;

public class TesteExcluirCupom {

	public static void main(String[] args) {

		ControllerCupom controller = new ControllerCupom();

		if (controller.excluirCupom(1))

			JOptionPane.showMessageDialog(null, "Excluído com sucesso");
		else
			JOptionPane.showMessageDialog(null, "Erro ao tentar excluír");

	}

}
