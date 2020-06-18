package br.com.loja.testes;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

import br.com.loja.controllers.ControllerProprietario;
import br.com.loja.entidades.Proprietario;

public class TesteListarProprietarios {

	public static void main(String[] args) {

		ControllerProprietario controllerProprietario = new ControllerProprietario();

		Set<Proprietario> setProprietario = new HashSet<>();

		List<?> listaProprietarios;

		try {

			listaProprietarios = controllerProprietario.listarProprietarios();

			for (Object proprietario : listaProprietarios)

				if (proprietario instanceof Proprietario)

					setProprietario.add((Proprietario) proprietario);

			for (Proprietario proprietario : setProprietario)

				System.out.println(proprietario.toString());

		} catch (NullPointerException exc) {

			JOptionPane.showMessageDialog(null, "Sua busca retornou(0)resultados");
		}
	}

}
