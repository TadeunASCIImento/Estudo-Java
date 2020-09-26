package br.com.estudo;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Operacao operacao = new Operacao();
		int op;
		double x, y;

		/*
		 * Laço for infinito, executa o programa enquanto a opção for diferente de 5
		 * (ESC)
		 */
		for (;;) {
			do {
				operacao.mostrarMenu();
				op = entrada.nextInt();
				/* Executa operação de acordo com a opção selecionada */
				switch (op) {/* verifica a operação selecionada */

				/* Efetua a operação de soma */
				case 1:
					operacao.mensagen();
					x = entrada.nextDouble();
					y = entrada.nextDouble();
					operacao.somar(x, y);
					break;
				/* Efetua a operação de subtração */
				case 2:
					operacao.mensagen();
					x = entrada.nextDouble();
					y = entrada.nextDouble();
					operacao.subtrair(x, y);
					break;
				/* Efetua a operação de multiplicação */
				case 3:
					operacao.mensagen();
					x = entrada.nextDouble();
					y = entrada.nextDouble();
					operacao.multiplicar(x, y);
					break;
				/* Efetua a operação de divisão */
				case 4:
					operacao.mensagen();
					x = entrada.nextDouble();
					y = entrada.nextDouble();
					operacao.dividir(x, y);
					break;
				/* Finaliza a execução do programa */
				case 5:
					System.out.println("<Terminado>");
					entrada.close();
					System.exit(1);
				}

			} while (!operacao.validarOpcao(op));/* verifica se a opção é válida */
			System.out.println("\n");
		}
	}
}

/* Inicio da classe aninhada operacao */
class Operacao {

	Scanner entrada = new Scanner(System.in);
	public double a, b, result;

	/* Método de exibição de mensagem ao usuário */
	public void mensagen() {
		System.out.println("Digite dois números:");
	}

	/* Exibe o menu de opções */
	public void mostrarMenu() {

		System.out.println("\nEscolha a operação:\n");
		System.out.println(" 1  - [ + ]");
		System.out.println(" 2  - [ - ]");
		System.out.println(" 3  - [ * ]");
		System.out.println(" 4  - [ / ]");
		System.out.println(" 5  - [ESC]");

	}

	/* Métodos para efetuar as operações */
	public void somar(double a, double b) {

		System.out.println("Resultado: " + a + " + " + b + " = " + (a + b));
	}

	public void subtrair(double a, double b) {

		System.out.println("Resultado: " + a + " - " + b + " = " + (a - b));
	}

	public void multiplicar(double a, double b) {

		System.out.println("Resultado: " + a + " x " + b + " = " + (a * b));
	}

	public void dividir(double a, double b) {

		System.out.println("Resultado: " + a + " / " + b + " = " + (a / b));
	}

	/* Valida a opção selecionada */
	public boolean validarOpcao(int opcao) {

		if (opcao < 1 | opcao > 4 & opcao != 5) {
			System.out.println("Operação inválida tente novamente!.");
			return false;
		} else {
			return true;
		}
	}
}
