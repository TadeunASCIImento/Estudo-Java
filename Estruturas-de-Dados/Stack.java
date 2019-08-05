package br.com.estudo;

import java.util.Stack;
import java.util.EmptyStackException;

public class ClasseStack {

	public static void main(String[] args) {

		// Cria uma pilha do tipo Number.
		Stack<Number> pilha = new Stack<Number>();

		System.out.println("\n\t< Inserindo elementos na pilha >\n");

		// Utiliza o metódo push para adicionar os valores na pilha.
		pilha.push(12L);
		System.out.println("\tInserido 12L");

		// mostra elementos da pilha
		mostrarStack(pilha);

		pilha.push(34567);
		System.out.println("\tInserido 34567");
		mostrarStack(pilha);

		pilha.push(1.0F);
		System.out.println("\tInserido 1.0F");
		mostrarStack(pilha);

		pilha.push(1245.567);
		System.out.println("\tInserido 1234,567");
		mostrarStack(pilha);

		System.out.println("\n\t< Removendo elementos da pilha >\n");

		// removendo itens da pilha.
		try {
			Number objetoRemovido = null;

			// Remove objeto da pilha.
			while (true) {
				objetoRemovido = pilha.pop();// metodo pop para remover objeto
				System.out.printf("\tRemovido da fila %s\n", objetoRemovido);
				mostrarStack(pilha);
			}
		} catch (EmptyStackException emptyStackException) {
			emptyStackException.printStackTrace();
		}
	}

	private static void mostrarStack(Stack<Number> pilha) {

		if (pilha.isEmpty()) {
			System.out.println("\tPilha vazia.");
		} else {
			System.out.printf("\tConteúdo: %s <--(topo da pilha.)\n\n", pilha);
		}
	}

}
