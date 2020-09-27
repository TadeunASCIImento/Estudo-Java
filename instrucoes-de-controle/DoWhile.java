package br.com.estudo;

public class DoWhile {

	public static void main(String[] args) {

		dowhile();

	}

	private static void dowhile() {
		boolean loop = true;
		int counter = 0;
		do {
			if (counter < 20)
				System.out.printf("Passo: %d\n\n", counter);
			else
				loop = false;
			counter++;
		} while (loop);
	}
}
