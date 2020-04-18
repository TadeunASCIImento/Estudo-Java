package br.com.testes;

import java.util.List;

import br.com.controllers.ControllerUsuario;
import br.com.entities.Entitie;

public class TesteListarUsuarios extends ControllerUsuario {

	public static void main(String[] args) {

		List<Entitie> listaUsuarios = listarUsuarios();

		for (Entitie usuario : listaUsuarios)

			System.out.println(usuario.toString());

	}

}
