package br.com.estudo;

public class VarargsTeste01 {

	public static void main(String[] args) {

		double valor1 = 90, valor2 = 40, valor3 = 89, valor4 = 10, valor5 = 67;

		/*
		 * Realiza chamada ao metodo calcularValorMedio que recebe um número de
		 *  argumentos diferentes em cada chamada, para calculo.
		 */

		// Aqui recebe valor1 e valor 2 para realizar o cálculo.
		System.out.println("\nResultado1: " + calcularValorMedio(valor1, valor2));

		// Aqui são passados 3 valores para o método realizar o calculo.
		System.out.println("\nResultado2: " + calcularValorMedio(valor1, valor2, valor3));

		// Aqui o método é chamado com todos os valores para o cálculo.
		System.out.println("\nResultado3: " + calcularValorMedio(valor1, valor2, valor3, valor4, valor5));

	}

	/* Método utilizando varargs para calcular a média */
	public static double calcularValorMedio(double... numeros) {

		double total = 0.0;
		for (double d : numeros)
			total += d;
		return total / numeros.length;
	}

}
