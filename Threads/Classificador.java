package br.com.threads;

import java.util.Random;

public class Classificador implements Runnable {

	public static void main(String[] args) {
		Thread tarefa = new Thread(new Classificador());
		tarefa.start();
	}

	private static void imprimirNumeros(int intNumeros) {
		System.out.println("  " + "[" + intNumeros + "]");
	}

	@Override
	public void run() {
		System.out.println("\n\t ( > 50 )\t\t ( < 50 ) \t\t Par  \t\t Impar");
		System.out.println("\t----------\t\t----------\t\t-------\t\t-------");
		try {

			Random numRand = new Random();
			int[] intNumeros = new int[10];

			for (int cont = 0; cont < intNumeros.length; cont++) {
				intNumeros[cont] = numRand.nextInt(100);

				if (intNumeros[cont] > 50) {
					Thread.sleep(1000);
					System.out.print("\t ");
					imprimirNumeros(intNumeros[cont]);
				}

				if (intNumeros[cont] < 50) {
					Thread.sleep(1000);
					System.out.print("\t\t\t\t ");
					imprimirNumeros(intNumeros[cont]);
				}

				if (intNumeros[cont] % 2 == 0) {
					Thread.sleep(1000);
					System.out.print("\t\t\t\t\t\t\t");
					imprimirNumeros(intNumeros[cont]);
				}

				if (intNumeros[cont] % 2 != 0) {
					Thread.sleep(1000);
					System.out.print("\t\t\t\t\t\t\t\t\t");
					imprimirNumeros(intNumeros[cont]);
				}

			}

			System.out.println("\n\t\t\t\t\t\t( Terminado )");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
