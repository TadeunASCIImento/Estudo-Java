package br.com.threads;

public interface Buffer {

	// Insere valor no buffer.
	public void inserir(int valor) throws InterruptedException;

	// retorna o valor int a partir do Buffer
	public int retornar() throws InterruptedException;

}
