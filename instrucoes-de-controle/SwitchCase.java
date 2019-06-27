package br.com.estudo;

import java.util.Scanner;

public class SwitchCase {

	void MostarIdh(int op) {
		switch (op) {
		case 1:
			System.out.println("01° Noruega - 0.953  ");
			break;
		case 2:
			System.out.println("02° Suiça - 0.944    ");
			break;
		case 3:
			System.out.println("03° Austrália - 0.939");
			break;
		case 4:
			System.out.println("04° Irlanda - 0.938  ");
			break;
		case 5:
			System.out.println("05° Alemanha - 0.936 ");
			break;
		case 6:
			System.out.println("06° Islândia - 0.935 ");
			break;
		case 7:
			System.out.println("07° Hong Kong - 0.933");
			break;
		case 8:
			System.out.println("08° Suécia - 0.933   ");
			break;
		case 9:
			System.out.println("09° Singapura - 0.932");
			break;
		case 10:
			System.out.println("10° Holanda - 0.931  ");
			break;
		case 11:
			System.out.println("79° Brasil - 0.759   ");
			break;

		}

	}

	void MostrarMenu() {

		System.out.println("\nEscolha um País para ver o IDH 2018.\n");
		System.out.println("1  -  Noruega");
		System.out.println("2  -  Suiça");
		System.out.println("3  -  Austrália");
		System.out.println("4  -  Irlanda");
		System.out.println("5  -  Alemanha");
		System.out.println("6  -  Islândia");
		System.out.println("7  -  Hong Kong");
		System.out.println("8  -  Suécia");
		System.out.println("9  -  Singapura");
		System.out.println("10 -  Holand");
		System.out.println("11 -  Brasil");
		System.out.println("\n99  -  Para sair");
	}

	boolean ValidarOpcao(int opc) {

		if (opc < 1 | opc > 11 & opc != 99)
			return false;
		else
			return true;

	}

}

//usando uma classe aninhada para facilitar o teste do programa
class SistemaIdh {

	public static void main(String[] args) {

		Scanner Teclado = new Scanner(System.in);
		int opcao;
		SwitchCase paises = new SwitchCase();

		for (;;) {
			do {
				paises.MostrarMenu();
				opcao = Teclado.nextInt();
			} while (!paises.ValidarOpcao(opcao));
			if (opcao == 99) {
				System.out.println("< Terminado >");
				break;
			} else {

				System.out.println("\n");

				paises.MostarIdh(opcao);

			}
		}
		Teclado.close();
	}

}
