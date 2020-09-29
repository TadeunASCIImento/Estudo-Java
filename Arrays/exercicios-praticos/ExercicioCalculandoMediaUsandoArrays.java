package br.com.estudo;

public class CalcularMediaArrays {

	public static void main(String[] args) {

		/*
		 * ENTRADA DE DADOS e DEFINICAO DAS VARIAVEIS
		 *
		 * Array unidimensional para armazenamento dos nomes das 2 disciplinas
		 */
		String[] disciplina;
		disciplina = new String[2];
		disciplina[0] = "Estruturas de Dados";
		disciplina[1] = "Lógica de Programação";

		// Array bidimensional para armazenamento das 4 notas de cada disciplina
		double[][] notas = new double[2][4];

		// Atribção das notas ao array
		notas[0][0] = 8.0;
		notas[0][1] = 7.5;
		notas[0][2] = 9.0;
		notas[0][3] = 8.5;
		notas[1][0] = 9.5;
		notas[1][1] = 8.5;
		notas[1][2] = 8.0;
		notas[1][3] = 9.0;

		// definicao da variável fracionaria media para armazenamento da média
		double media = 0.0;

		// Label (rotulo) para salto simples de linha e do título "MEDIA"
		System.out.println("\n\t\t\tMEDIAS POR DISCIPLINA:");

		// controle de busca por disciplina através da variavel l
		for (int l = 0; l < notas.length; l++) {

			// controle de busca das 4 notas de cada disciplina através da variavel c
			for (int c = 0; c < notas[l].length; c++) {

				// acumulador das 4 notas de cada disciplina na variavel media
				media = media + notas[l][c];
			}

			// calculo aritmetico da variavel media acumulada por disciplina
			media = media / 4;

			/* SAIDA DE DADOS */
			/*
			 * Apresentacao do resultado apos o processamento com concatenacao de string e
			 * variaveis
			 */
			System.out.println("\n\t\t\t" + disciplina[l] + " = " + media);
			media = 0.0;
		}
		System.out.println("\n");
	}
}
