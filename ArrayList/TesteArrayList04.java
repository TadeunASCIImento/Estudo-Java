package br.com.estudo;

import java.util.ArrayList;

public class TesteArrayList04 {

	public static void main(String[] args) {

		// Cria um array do tipo Number.
		Number[] numeros = { 1, 2.4, 3, 4.1, 56, 7.9, 5000L, 23.89F };

		// Cria a lista contendo o array de numeros.
		ArrayList<Number> listaNumeros = new ArrayList<Number>();

		// Adiciona os números na lista.
		for (Number numero : numeros)
			listaNumeros.add(numero);

		// Exibe os números na lista.
		System.out.println("Lista de numeros" + listaNumeros);

		// Exibe a soma de todos os número na lista.
		System.out.println("Soma total dos núemros na lista: " + somarNumeros(listaNumeros));

	}

	// Metodo que realiza a soma dos elementos na lista utilizando curinga ( ? ).
	private static double somarNumeros(ArrayList<? extends Number> listaNumeros) {
		double total = 0;
		// ForEach percorre a lista de numeros.
		for (Number numero : listaNumeros)
			// doubleValue() metodo static para obter o valor primitivo de numero subjacente.
			total += numero.doubleValue();
		return total;
	}

}
