package br.com.estudo;

import java.util.Scanner;

public class CalculadoraOperacoesBasicas {

	private static Scanner scanner = new Scanner(System.in);
	private static String inputValorMessage = "informe o valor? :";
	private static String endMessage = "calculadora finalizada.";

	public static void main(String[] args) {

		do {
			exibirMenuDeOpcoesParaCalculo();
			int opcao = getInputScannerInt();
			if (opcao == -1) {
				showMessage(endMessage);
				System.exit(1);
			}
			showMessage(inputValorMessage);
			double valor1 = getInputScannerDouble();
			showMessage(inputValorMessage);
			double valor2 = getInputScannerDouble();
			double resultado = executeCalculo(opcao, valor1, valor2);
			showResultado(resultado);

		} while (true);
	}

	private static void showMessage(String message) {
		System.out.print(message);
		System.out.println();
	}

	private static double getInputScannerDouble() {
		double valorDouble = scanner.nextDouble();
		return valorDouble;
	}

	private static void exibirMenuDeOpcoesParaCalculo() {
		System.out.println("Selecione uma opção para cálculo:");
		System.out.println("(1)Somar");
		System.out.println("(2)Subtrair");
		System.out.println("(3)Dividir");
		System.out.println("(4)Multiplicar");
		System.out.println("(-1)Finalizar");
	}

	private static int getInputScannerInt() {
		int valorInt = scanner.nextInt();
		return valorInt;
	}

	private static double executeCalculo(int opcao, double valor1, double valor2) {
		double resultado = 0;
		switch (opcao) {
		case 1:
			resultado = valor1 + valor2;
			break;
		case 2:
			resultado = valor1 - valor2;
			break;
		case 3:
			resultado = valor1 / valor2;
			break;
		case 4:
			resultado = valor1 * valor2;
			break;
		}
		return resultado;
	}

	private static void showResultado(double resultado) {
		System.out.printf("\no valor cálculado: %.2f\n\n", resultado);
	}

}
