package br.com.estudo;

public class ComparandoDadosGenericos {

	public static void main(String[] args) {

		System.out.printf("Maior de  %d, %d e %d é %d.\n\n", 3, 4, 5, verificaMaiorElemento(3, 4, 5));

		System.out.printf("Maior de  %.1f, %.1f e %.1f é %.1f.\n\n", 6.6, 8.8, 7.7,
				verificaMaiorElemento(6.6, 8.8, 7.7));

		System.out.printf("Maior de  %s, %s e %s é %s.\n", "Notebook", "Roteador", "Servidor",
				verificaMaiorElemento("Notebook", "Roteador", "Servidor"));
	}

	public static <T extends Comparable<T>> T verificaMaiorElemento(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}
}
