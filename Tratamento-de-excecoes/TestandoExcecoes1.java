package execoes;

public class TestandoExcecoes1 {

	public static void main(String[] args) {

		// Array de inteiros de tamanho 4.
		int nums[] = new int[4];

		// Inicio da instrução try/catch.
		try {
			System.out.println("\nGerando uma exceção");
			// Gera uma exceção por exceder o tamanho do array nums.
			nums[7] = 90;
			/*
			 * Sera exibida esta mensagem no console somente se existir o indíce 7 no array.
			 */
			System.out.println("\nValor em nums[7]" + nums[7]);

			// instrução catch captura a excecão.
		} catch (ArrayIndexOutOfBoundsException exc) {
			// mensagem exibida após a captura da exceção.
			System.err.println("Indice não localizado");
		} // fim da instrução try/catch.

		// continua a execução do programa após tratamento da exceção.
		System.out.println("Após o catch");
		int num[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		for (int i = 0; i < num.length; i++) {

			try {
				/*
				 * dividindo os elementos em num pelos elementos em denom. Gera outra exceção
				 * ArrayIndexOutOfBoundsException devido a diferença de tamanho entre os arrays
				 * gera uma exceção na tentativa de divisão por zero (ArithmeticException).
				 */
				System.out.println(num[i] + "/" + denom[i] + " é: " + num[i] / denom[i]);

				// Gera outra exceção ArrayIndexOutOfBoundsException
				System.out.println(num[9]);

			}
			// captura ambas as exceções se ocorrerem.
			catch (final ArithmeticException | ArrayIndexOutOfBoundsException exc) {
				System.out.println("Uma exeção foi gerada!!!!");
				exc.printStackTrace();// exibe exceção gerada.

			}
		}

		for (int j = 0; j < num.length; j++) {
			try {
				System.out.println(num[j] + "/" + denom[j] + " é: " + num[j] / denom[j]);
				System.out.println(num[9]);

			}

			catch (ArrayIndexOutOfBoundsException exc) {
				System.out.println("Indice não localizado");
				exc.printStackTrace();
			}

			catch (Throwable exc) {
				System.out.println("Ocorreu uma excecão!!!!");
				System.out.println(exc);
				exc.printStackTrace();

			}

			// instrução finally
			finally {
				// Continua execução após saída do bloco try/catch.
				System.out.println("Executado na saída do try catch");
			}

		}

	}

}
