package br.com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BufferCompartilhadoTeste2 {

	public static void main(String[] args) {

		// cria um novo poll de threads
		ExecutorService executor = Executors.newCachedThreadPool();

		// cria buffer para aramazenar os inteiros.
		Buffer bufferCompartilhado = new BufferSincronizado();

		System.out.printf("%-40s%s\t\t%s\n%-40s%s\n\n", "Operação", "Buffer", "bufferOcupado", "---------",
				"------\t\t", "--------");
		executor.execute(new ThreadProdutora(bufferCompartilhado));
		executor.execute(new ThreadConsumidora(bufferCompartilhado));
		executor.shutdown();
	}

}
