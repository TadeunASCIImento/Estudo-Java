package br.com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BufferBloqueadoTeste {

	public static void main(String[] args) {

		// cria um bufferBloqueado para armazenar os inteiros
		Buffer bufferCompartilhado = new BufferBloqueado();

		// cria novo poll de threads com duas threads
		ExecutorService executor = Executors.newCachedThreadPool();
		executor.execute(new ThreadProdutora(bufferCompartilhado));
		executor.execute(new ThreadConsumidora(bufferCompartilhado));
		executor.shutdown();

	}

}
