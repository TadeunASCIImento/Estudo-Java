package br.com.estudo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculaMediaAluno {
	static Scanner scanner = new Scanner(System.in);

	public static double calcularMedia(ArrayList<Double> notas) {
		double total = 0.0;
		for (double dblNumero : notas)
			total += dblNumero;
		return total / notas.size();
	}

	public static void main(String[] args) {

		ArrayList<Double> notas = new ArrayList<Double>();
		boolean continueLoop = true;
		System.out.println("Digite as notas do aluno  e <99>-Para calcular média  ou <66>-Sair.");
		do {
			try {
				for (;;) {
					double nota = scanner.nextDouble();
					if (nota == 99) {
						System.out.println("\nNotas do aluno: " + notas);
						System.out.println("Média do aluno: " + (float) (calcularMedia(notas)));
						System.out.println(calcularMedia(notas) < 6 ? "Aluno reprovado." : "Aluno aprovado.");
						notas.clear();
						continue;
					} else if (nota == 66) {
						System.out.println("<Finalizado>");
						continueLoop = false;
						System.exit(1);
					} else {
						notas.add(nota);
					}
				}
			} catch (InputMismatchException exc) {
				System.err.println("Valor inválido!!  ");
				scanner.nextLine();
				System.out.printf("\nDigite apenas números tente novamente:\n");
				notas.clear();
			}
		} while (continueLoop);
	}

}
