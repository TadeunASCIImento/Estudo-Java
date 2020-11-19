package execoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestandoExcessoes2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean continueLoop = true;
		do {

			System.out.println("Digite dois números: ");
			double x = input.nextDouble();
			double y = input.nextDouble();
			try {
				// realiza a divisão de x por y usando método relaizarDivisao().
				System.out.printf("A divisão de %.2f por %.2f = %.2f", x, y, realizarDivisao(x, y));
				continueLoop = false;

				// captura exceção aritmética exp:(divisão por zero)
			} catch (ArithmeticException arithmeticException) {
				System.err.println("\nExceção capturada: " + arithmeticException);

				input.nextLine();// solicita novamente a entrada dos dados para processamento.
				System.out.println("Não é possível realizar a divisão por zero, tente novamente: ");

				// captura entrada de dados com formato não esperado
			} catch (InputMismatchException inputMismatchException) {
				System.err.println("\nExceção capturada: " + inputMismatchException);
				input.nextLine();
				System.out.printf("\nVocê precisa digitar números inteiros, tente novamente:\n");

			}

			finally {
				System.out.println("\nFim do programa.");

			}

		} while (continueLoop);

		input.close();
	}

	// Metodo que pode lançar uma ArithmeticException
	public static double realizarDivisao(double numerador, double denominador) throws ArithmeticException {
		double resultado = 0.0;
		resultado = numerador / denominador;
		return resultado;
	}

}
