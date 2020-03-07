package br.com.threads;

public class BufferNaoSincronizado implements Buffer {

	private int buffer = -1;// compartilhado entre as threads

	// coloca valores no buffer
	@Override
	public void inserir(int valor) throws InterruptedException {
		System.out.printf("Produtora escreveu\t%2d", valor);
		buffer = valor;
	}

	// retorna valores do buffer
	@Override
	public int retornar() throws InterruptedException {
		System.out.printf("ThreadConsumidora leu\t\t%2d", buffer);
		return buffer;
	}

}
