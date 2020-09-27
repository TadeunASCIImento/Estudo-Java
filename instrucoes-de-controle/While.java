package br.com.estudo;

public class While {

	public static void main(String[] args) {

		getWhile();

	}

	private static void getWhile() {
		boolean loop = true;
		int counter = 0;
		while (loop) {
			if (counter < 20) {
				System.out.printf("Passo: %d\n", counter);
			} else {
				loop = false;
			}
			counter++;
		}
	}
}
