package br.com.java.lambdas;

/*
 * Percorrendo uma lista com laço ForEach da Api de Lambdas.
 */

import java.util.Arrays;
import java.util.List;

public class TestandoLambdas1 {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("Jhon Doe", 300);
		Usuario usuario2 = new Usuario("Jane Doe", 300);
		Usuario usuario3 = new Usuario("Tina Doe", 300);
		List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

		System.out.println("Usuários antes de se tornarem moderadores");
		imprimeUsuarioDaFormaAntiga(usuarios);

		System.out.println("\nTodos os usuários tornados moderadores");
		tornaTodosUsuariosModeradores(usuarios);

		imprimeUsuarioDaFormaNova(usuarios);
	}

	// Torna todos os usuários moderadores
	private static void tornaTodosUsuariosModeradores(List<Usuario> usuarios) {
		usuarios.forEach(usuario -> usuario.tornaModerador());
	}

	// Usa o laço melhorado para percorrer a lista e exibir o nome.
	public static void imprimeUsuarioDaFormaAntiga(List<Usuario> usuarios) {
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getNome() + " é moderador? " + usuario.isModerador());
		}
	}

	// Usa o laço forEach da Api de Lambdas para percorrer e exibir o nome.
	public static void imprimeUsuarioDaFormaNova(List<Usuario> usuarios) {
		usuarios.forEach((usuario) -> {
			System.out.println(usuario.getNome() + " é moderador? " + usuario.isModerador());
		});
	}

}
