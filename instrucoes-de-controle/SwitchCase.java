package br.com.estudo;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true) {// cria um laço while infinito

			System.out.println("\n\t\tDigite uma opção?\n");
			System.out.println("\t\t[ cancelar ]\t\t[  Salvar  ]\t\t[ Deletar  ]");
			String strCommand = input.next();

			switch (strCommand) {// controlado por String

			case "Cancelar":
				System.out.println("\t\tCancelando.....");
				break;

			case "Salvar":
				System.out.println("\t\tSalvando.......");
				break;

			case "Deletar":
				System.out.println("\t\tDeletando......");
				break;

			default:
				System.out.println("\t\tInválido.......");
				break;

			}

		}

	}
}
