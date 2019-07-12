package br.com.estudo;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculaMediaArrayList {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Float> medias = new ArrayList<Float>();

		float arrayNotas[] = new float[3], nota = 0;
		boolean continueLoop = true;
		float media = 0, total = 0;

		while (continueLoop) {
			System.out.println("\n\t\t\t\t< Digite as notas, ou ( -1 ) para Sair >");
			for (int cont = 0; cont < arrayNotas.length; cont++) {
				nota = scanner.nextFloat();
				if (nota == -1) {
					System.out.println("\t\t\t\t< Finalizado >");
					System.exit(1);
				} else {
					arrayNotas[cont] = nota;
					total += arrayNotas[cont];
				}
			}

			media = total / arrayNotas.length;
			System.out.println("\n\t\t\t\t[ Média calculada ]:" + media);
			medias.add(media);
			total = 0;
			System.out.println("\n\t\t\t\t[ Médias armazenadas no ArrayList ]: " + medias);

			float total2 = 0;
			for (float tot : medias)
				total2 += tot;
			System.out.println("\n\t\t\t\t[ Soma das notas no ArrayList ]:" + total2);
			System.out.println();
		}
		scanner.close();
	}
}
