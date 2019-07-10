package br.com.estudo;

public abstract class StringBuilderAppend {

	public static void main(String[] args) {

		Object objectRef = "Java";
		String string = "Programando";
		char[] charArray = { 'a', 'b', 'c', 'd', 'e' };
		boolean valorBoleano = true;
		char caracter = 'M';
		int idade = 36;
		long saldo = 10000000000000L;
		float altura = 1.76F;
		double peso = 79.500;

		StringBuilder finalBuffer = new StringBuilder("Final bufffer");

		StringBuilder buffer = new StringBuilder();

		buffer.append(objectRef + "\n");
		buffer.append(string + "\n");
		buffer.append(charArray);
		buffer.append("\n");
		buffer.append(valorBoleano + "\n");
		buffer.append(caracter + "\n");
		buffer.append(idade + "\n");
		buffer.append(saldo + "\n");
		buffer.append(altura + "\n");
		buffer.append(peso + "\n");
		buffer.append(finalBuffer + "\n");

		System.out.println(buffer.toString());

	}

}
