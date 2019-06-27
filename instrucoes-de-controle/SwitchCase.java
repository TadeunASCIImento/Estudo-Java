package br.com.estudo;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean continueLoop = true;

		while (continueLoop) {// cria um laço while infinito

			System.out.println("\n\t\tDigite uma opção?\n");
			System.out.println("\t\t[ Cancelar ]\t\t[  Salvar  ]\t\t[ Deletar  ]\t\t[ Sair  ]");
			String strCommand = input.next();

			switch (strCommand) {// controlado por String

			case "Cancelar":
				System.out.println("\t\tCancelando.....\n");
				break;

			case "Salvar":
				System.out.println("\t\tSalvando.......\n");
				break;

			case "Deletar":
				System.out.println("\t\tDeletando......\n");
				break;

			case "Sair":
				continueLoop = false;
				System.out.println("\t\tTerminado......\n");
				break;

			default:
				System.out.println("\t\tInválido.......\n");
				break;

			}

		}

	}
}
