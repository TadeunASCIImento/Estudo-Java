package br.com.estudo;

public class UsandoStringBuilder {

	public static void main(String[] args) {

		StringBuilder buffer = new StringBuilder("Usando StringBuilder");

		System.out.println("\n\t\t" + buffer.toString());

		if (buffer.length() < 10)
			System.out.println("\n\n\t\tÉ menor que 10, tamanho: " + buffer.length());
		else
			System.out.println("\n\n\t\tÉ maior que 10,  tamanho: " + buffer.length());

		System.out.print("\n\t\tinvertendo buffer: ");
		System.out.println(buffer.reverse());

		System.out.print("\n\t\tinvertendo novamente para o formato original: ");
		System.out.println(buffer.reverse());

		buffer.setCharAt(0, 'u');

		buffer.setCharAt(19, 'R');

		System.out.println("\n\t\tSubstituindo  as letras nos indices 0 e 19");
		System.out.println("\n\t\t" + buffer.toString());
	}

}
