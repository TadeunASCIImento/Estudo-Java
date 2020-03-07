package br.com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BufferCompartilhadoTeste {

	public static void main(String[] args) {

		// cria um novo pool de threads com duas threads
		ExecutorService executor = Executors.newCachedThreadPool();

		// cria um buffer BufferNaoSincronizado para armazenar os inteiros
		Buffer bufferCompartilhado = new BufferNaoSincronizado();

		System.out.println("Ação\t\tValor\t\tSoma do Produzido\tSoma do Consumido");
		System.out.println("--------\t--------\t-----------------\t----------------\n");

		// Executa as threads fornecendo acesso ao bufferCompartilhado
		executor.execute(new ThreadProdutora(bufferCompartilhado));
		executor.execute(new ThreadConsumidora(bufferCompartilhado));
		executor.shutdown();// termina o aplicatico quando as threads terminarem

	}

}
