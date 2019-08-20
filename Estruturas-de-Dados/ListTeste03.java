package br.com.estudo;

public class ListTeste03 {
	public static void main(String[] args) {

		// cria a lista de numeros inteiros
		Lista<Integer> listaNumeros = new Lista<Integer>();

		// inserindo números na lista
		listaNumeros.inserirInicio(3);
		listaNumeros.mostrar();
		listaNumeros.inserirInicio(2);
		listaNumeros.mostrar();
		listaNumeros.inserirFinal(8);
		listaNumeros.mostrar();
		listaNumeros.inserirFinal(0);
		listaNumeros.mostrar();

		// remove os elementos da lista e mostra após a remoção
		try {
			int numeroRemovido = listaNumeros.removerInicio();
			System.out.printf("\n%d removido\n", numeroRemovido);
			listaNumeros.mostrar();

			numeroRemovido = listaNumeros.removerInicio();
			System.out.printf("\n%d removido\n", numeroRemovido);
			listaNumeros.mostrar();

			numeroRemovido = listaNumeros.removerFinal();
			System.out.printf("\n%d removido\n", numeroRemovido);
			listaNumeros.mostrar();

			numeroRemovido = listaNumeros.removerFinal();
			System.out.printf("\n%d removido\n", numeroRemovido);

			listaNumeros.mostrar();

		} catch (EmptyListException emptyListException) {
			emptyListException.printStackTrace();
		}
	}
}

class ListNode<T> {

	T dado;
	ListNode<T> nextNode;

	ListNode(T objeto) {
		this(objeto, null);
	}

	ListNode(T objeto, ListNode<T> node) {
		dado = objeto;
		nextNode = node;
	}

	T getDado() {
		return dado;
	}

	ListNode<T> getNext() {
		return nextNode;
	}
}

class Lista<T> {

	private ListNode<T> primeiroNo;
	private ListNode<T> ultimoNo;
	private String nome;

	public Lista() {
		this("Lista");
	}

	public Lista(String listName) {

		nome = listName;
		primeiroNo = ultimoNo = null;
	}

	public void inserirInicio(T elementoInserido) {

		if (isEmpty())
			primeiroNo = ultimoNo = new ListNode<T>(elementoInserido);
		else
			primeiroNo = new ListNode<T>(elementoInserido, primeiroNo);
	}

	public void inserirFinal(T elementoInserido) {

		if (isEmpty())
			primeiroNo = ultimoNo = new ListNode<T>(elementoInserido);
		else
			ultimoNo = ultimoNo.nextNode = new ListNode<T>(elementoInserido);
	}

	public T removerInicio() throws EmptyListException {

		if (isEmpty())
			throw new EmptyListException(nome);
		T elementoRemovido = primeiroNo.dado;
		if (primeiroNo == ultimoNo)
			primeiroNo = ultimoNo = null;
		else
			primeiroNo = primeiroNo.nextNode;
		return elementoRemovido;
	}

	public T removerFinal() throws EmptyListException {
		if (isEmpty())
			throw new EmptyListException(nome);
		T elementoRemovido = ultimoNo.dado;
		if (primeiroNo == ultimoNo)
			primeiroNo = ultimoNo = null;

		else {
			ListNode<T> elementoAtual = primeiroNo;
			while (elementoAtual.nextNode != ultimoNo)
				elementoAtual = elementoAtual.nextNode;
			ultimoNo = elementoAtual;
			elementoAtual.nextNode = null;
		}
		return elementoRemovido;
	}

	public boolean isEmpty() {
		return primeiroNo == null;
	}

	public void mostrar() {
		if (isEmpty()) {
			System.out.println(nome + " vazia\n");
			return;
		}
		System.out.printf("A %s é: ", nome);
		ListNode<T> elementoAtual = primeiroNo;
		while (elementoAtual != null) {
			System.out.printf("%s ", elementoAtual.dado);
			elementoAtual = elementoAtual.nextNode;
		}
		System.out.println();
	}
}
