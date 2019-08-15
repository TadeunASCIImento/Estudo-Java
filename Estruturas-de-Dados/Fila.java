package br.com.estudo;

public class FilaTeste {

	public static void main(String[] args) {

		Fila<Number> fila = new Fila<Number>();

		// enfileirando os dados
		fila.enfileirar(2.6D);
		fila.mostrar();// mostra dado inserido na fila
		fila.enfileirar(5);
		fila.mostrar();
		fila.enfileirar(7);
		fila.mostrar();
		fila.enfileirar(9000000L);
		fila.mostrar();

		// removendo os dados da fila
		try {
			Number dadoRemovido;

			while (true) {
				dadoRemovido = fila.desenfileirar();
				System.out.printf("\n%d desenfileirado\n", dadoRemovido);
				fila.mostrar();
			}
		} catch (EmptyListException emptyListException) {
			emptyListException.printStackTrace();
		}
	}
}

class Fila<T> {
	private Lista<T> filaLista;

	public Fila() {
		filaLista = new Lista<T>("fila");
	}

	public void enfileirar(T dado) {
		filaLista.inserirInicio(dado);
	}

	public T desenfileirar() throws EmptyListException {
		return filaLista.removerInicio();
	}

	public boolean isEmpty() {
		return filaLista.isEmpty();
	}

	public void mostrar() {
		filaLista.mostrar();
	}
}
