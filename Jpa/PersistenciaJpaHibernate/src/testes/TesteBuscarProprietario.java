package br.com.loja.testes;

import javax.swing.JOptionPane;

import br.com.loja.controllers.ControllerProprietario;
import br.com.loja.entidades.Proprietario;

public class TesteBuscarProprietario {

	public static void main(String[] args) {

		ControllerProprietario controllerProprietario = new ControllerProprietario();

		Proprietario proprietario = (Proprietario) controllerProprietario.buscarProprietario(1L);

		if (proprietario != null)

			System.out.println(proprietario.toString());
		else
			JOptionPane.showMessageDialog(null, "Proprietario não localizado.");

	}

}
