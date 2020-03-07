package br.com.threads;

public class BufferSincronizado implements Buffer {

	private int numero = -1;// buffer compartilhado entre as threads
	private boolean numeroOcupado = false;// se o buffer estiver ocupado

	// coloca valor no buffer
	@Override
	public synchronized void inserir(int valor) throws InterruptedException {
		while (numeroOcupado) {
			// envia info de thread e as infos de buffer para saída, e espera
			System.out.println("Produtora tenta escrever.");
			mostrarEstado("Buffer cheio produtora espera.");
			wait();// chamada a wait faz thread aguardar.
		}
		numero = valor;// configura novo valor no buffer.
		// produtora não pode armazenar até a consumidora recuperar o valor
		// atual no buffer
		numeroOcupado = true;
		mostrarEstado("Produtora escreveu: " + numero);
		notifyAll();// faz threads em espera entrar no estado executável
		// e libera o bloqueio
	}

	// retorna valor do buffer
	@Override
	public synchronized int retornar() throws InterruptedException {
		// espera enquanto os dado não são lidos
		while (!numeroOcupado) {
			System.out.println("Consumidora tenta ler.");
			mostrarEstado("Buffer vazio, consumidora espera.");
			wait();
		}
		numeroOcupado = false;
		mostrarEstado("Consumidora lêu: " + numero);
		notifyAll();
		return numero;
	}

	public void mostrarEstado(String operacao) {
		System.out.printf("%-40s%d\t\t%b\n\n", operacao, numero, numeroOcupado);

	}

}
