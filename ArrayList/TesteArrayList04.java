package br.com.estudo;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  Realizando a soma de elementos de diversos tipos numéricos com ArrayList.
 */

public class TesteArrayList04 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// cria e exibe um array do tipo numbers com 10 elementos.
		print("informe 10 números para o ArrayNumber:");
		Number[] arrayNumbers = obterArrayDoTipoNumbers();
		print("elementos em ArrayNumbers");
		exibirArrayNumbers(arrayNumbers);
		print("\n");

		// cria um ArrayList do tipo Number que recebe os elementos de arrayNumbers.
		ArrayList<Number> arrayListNumbers = new ArrayList<Number>();
		adicionarArrayNumberAoArrayListNumber(arrayNumbers, arrayListNumbers);
		print("elementos em ArrayListNumbers");
		exibirArrayListNumbers(arrayListNumbers);
		print("\n");

		// realiza soma dos elementos em arrayListNumber e exibe o reultado.
		print("soma dos elementos em ArrayListNumber: ");
		double soma = somarArrayListNumbers(arrayListNumbers);
		exibirResultadoDaSoma(soma);

	}

	// obtem os valores para o array a partir do teclado.
	private static Number[] obterArrayDoTipoNumbers() {
		Number[] arrayNumbers = new Number[10];
		for (int i = 0; i < arrayNumbers.length; i++) {
			arrayNumbers[i] = scanner.nextDouble();
		}
		return arrayNumbers;
	}

	// passa os elementos de arrayNumbers para arrayListNumbers.
	private static void adicionarArrayNumberAoArrayListNumber(Number[] arrayNumber,
			ArrayList<Number> arrayListNumbers) {
		for (Number number : arrayNumber) {
			arrayListNumbers.add(number);

		}

	}

	// exibe os elementos em arrayNumbers.
	private static void exibirArrayNumbers(Number[] arrayNumbers) {
		for (Number number : arrayNumbers) {
			print("(" + number + ")");

		}

	}

	// exibe os elementos em arrayListNumbers.
	private static void exibirArrayListNumbers(ArrayList<Number> arrayListNumbers) {
		for (Number number : arrayListNumbers) {
			print("(" + number + ")");
		}

	}

	// realiza a soma dos elementos em arrayListNumbers.
	private static double somarArrayListNumbers(ArrayList<Number> arrayListNumbers) {
		double total = 0;
		for (Number number : arrayListNumbers) {
			total += number.doubleValue();
		}
		return total;
	}

	// exibe o resultado da soma.
	private static void exibirResultadoDaSoma(double soma) {
		print(soma);

	}

	// imprime no console.
	private static void print(Object object) {
		System.out.print(object);

	}

}
