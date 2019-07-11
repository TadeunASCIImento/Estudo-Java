package br.com.estudo;

public class While {

	public static void main(String[] args) {

		boolean continueLoop = true;
		int contador = 0;

		while (continueLoop) {
			if (contador < 20)
				System.out.println("Passo: " + contador);
			else
				continueLoop = false;
			contador++;

		}

	}

}
