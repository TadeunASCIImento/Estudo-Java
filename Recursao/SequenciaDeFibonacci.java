package br.com.recursao;

import java.math.BigInteger;

public class SequenciaDeFibonacci {

	private static BigInteger TWO = BigInteger.valueOf(2);

	public static BigInteger fibonacci(BigInteger numero) {

		if (numero.equals(BigInteger.ZERO) || numero.equals(BigInteger.ONE))
			return numero;
		else
			return fibonacci(numero.subtract(BigInteger.ONE)).add(fibonacci(numero.subtract(TWO)));

	}

	public static void main(String[] args) {

		for (int counter = 0; counter <= 40; counter++)
			System.out.printf("Fibonacci de %d é:  %d\n ", counter, fibonacci(BigInteger.valueOf(counter)));

	}

}
