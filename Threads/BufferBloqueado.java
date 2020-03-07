package br.com.threads;

import java.util.concurrent.ArrayBlockingQueue;

public class BufferBloqueado implements Buffer {

	private final ArrayBlockingQueue<Integer> buffer;// buffer compartilhado

	// construtor da classe
	public BufferBloqueado() {
		buffer = new ArrayBlockingQueue<Integer>(1);
	}

	@Override // Insere o valor no buffer
	public void inserir(int valor) throws InterruptedException {
		buffer.put(valor);// Insere o valor no buffer
		System.out.printf("%s%2d\t\t%s%d\n", "Produtora escreveu: ", valor, "celulas do buffer ocupadas:  ",
				buffer.size());

	}

	@Override // retorna o valor do buffer
	public int retornar() throws InterruptedException {
		int valorLido = buffer.take();// remove o valor do buffer
		System.out.printf("%s %2d\t\t%s%d\n", "Consumidora leu: ", valorLido, "Celulas do buffer ocupadas:  ",
				buffer.size());
		return valorLido;
	}

}
