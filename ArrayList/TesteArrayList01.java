package br.com.estudo;

import java.util.ArrayList;

import java.security.SecureRandom;
import java.util.ArrayList;

/*
 *  Declarando, inserindo e exibindo dados em ArrayLists.
 */

public class TestesArrayList01 {

	private static SecureRandom secureRandon = new SecureRandom();

	public static void main(String[] args) {

		print("ArrayInteger:");
		ArrayList<Integer> arrayListInteger = gerarArrayListInteger();
		print(arrayListInteger);

		print("\n\nArrayDouble:");
		ArrayList<Double> arrayListDouble = gerarArrayListDouble();
		print(arrayListDouble);

		print("\n\nArrayFloat:");
		ArrayList<Float> arrayListFloat = gerarArrayListFloat();
		print(arrayListFloat);

		print("\n\nArrayString:");
		ArrayList<String> arrayListString = gerarArrayListString();
		print(arrayListString);

		print("\n\nArrayNumber:");
		ArrayList<Number> arrayListNumber = gerarArrayListNumber();
		print(arrayListNumber);

	}

	// cria um ArrayList do tipo Integer com 20 elementos aleatórios.
	private static ArrayList<Integer> gerarArrayListInteger() {
		ArrayList<Integer> arrayListInteger = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			arrayListInteger.add((1 + secureRandon.nextInt(100)));
		}
		return arrayListInteger;
	}

	// cria um ArrayList do tipo Double com 20 elementos aleatórios.
	private static ArrayList<Double> gerarArrayListDouble() {
		ArrayList<Double> arrayListDouble = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			arrayListDouble.add((double) (1 + secureRandon.nextInt(100)));
		}
		return arrayListDouble;
	}

	// cria um ArrayList do tipo Float com 20 elementos aleatórios.
	private static ArrayList<Float> gerarArrayListFloat() {
		ArrayList<Float> arrayListFloat = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			arrayListFloat.add((float) (1 + secureRandon.nextInt(100)));
		}
		return arrayListFloat;
	}

	// cria um ArrayList do tipo String com as strings em arrayStrings.
	private static ArrayList<String> gerarArrayListString() {
		ArrayList<String> arrayListString = new ArrayList<>();
		String[] arrayStrings = { "Java como programar", "Java para iniciantes", "Estruturas de Dados com Java",
				"Sistemas de Banco de Dados" };
		for (int i = 0; i < arrayStrings.length; i++) {
			arrayListString.add(arrayStrings[i]);
		}
		return arrayListString;
	}

	// cria um ArrayList do tipo Number com diversos tipos numéricos.
	private static ArrayList<Number> gerarArrayListNumber() {
		ArrayList<Number> arrayListNumber = new ArrayList<Number>();
		byte numByte = (byte) 64;
		arrayListNumber.add(10);
		arrayListNumber.add(200L);
		arrayListNumber.add(3.78F);
		arrayListNumber.add(20.0D);
		arrayListNumber.add(numByte);
		return arrayListNumber;
	}

	private static void print(Object object) {
		System.out.print(object);
	}
}
