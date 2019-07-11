package br.com.estudo;

public class DoWhile {

	public static void main(String[] args) {

		boolean continueLoop = true;
		int contador = 0;

		do {
			if (contador < 20)
				System.out.println("Passo: " + contador);
			else
				continueLoop = false;
			contador++;

		} while (continueLoop);

	}

}
