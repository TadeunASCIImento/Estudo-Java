package br.com.recursao;

import java.math.BigInteger;

public class CalculaFatorialComBigInteger {

	public static BigInteger fatorial(BigInteger numero) {

		if (numero.compareTo(BigInteger.ONE) <= 0)
			return BigInteger.ONE;
		else
			return numero.multiply(fatorial(numero.subtract(BigInteger.ONE)));

	}

	public static void main(String[] args) {

		for (int counter = 0; counter <= 20; counter++)
			System.out.printf("%d! = %d\n", counter, fatorial(BigInteger.valueOf(counter)));

	}
}
