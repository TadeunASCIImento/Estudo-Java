package br.com.java.lambdas;

/*
 * Instanciando a interface Runnable usando Lambdas.
 */
public class TestandoLambdas2 {

	public static void main(String[] args) {
		// Dessa forma.
		Runnable r = () -> {
			for (int i = 0; i < 2000; i++) {
				System.out.printf("%d ", i);
				if (i % 20 == 0) {
					System.out.println();
				}
			}
		};
		new Thread(r).start();

		// Outra forma.
		new Thread(() -> {
			for (int i = 0; i < 2000; i++) {
				System.out.printf("%d ", i);
				if (i % 10 == 0) {
					System.out.println();
				}
			}
		}).start();

	}

}
