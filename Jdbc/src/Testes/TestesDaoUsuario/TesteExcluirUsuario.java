package br.com.testes;

import javax.swing.JOptionPane;

import br.com.controllers.ControllerUsuario;

public class TesteExcluirUsuario extends ControllerUsuario {

	public static void main(String[] args) {

		Integer idUsuario = Integer.parseInt(JOptionPane.showInputDialog("Informe o id do usuário"));

		Integer opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluír o usuário");

		switch (opcao) {

		case 0:
			if (excluirUsuario(idUsuario))

				JOptionPane.showMessageDialog(null, "Usuário excluído");
			else
				JOptionPane.showMessageDialog(null, "Erro ao excluír");
			break;
		case 1:
			System.exit(1);
			break;
		}

	}

}
