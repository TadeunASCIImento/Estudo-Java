package br.com.recursao;

public class CalculaFatorial {

	public static long fatorial(long numero) {
		if (numero <= 1)
			return 1;
		else
			return numero * fatorial(numero - 1);

	}

	public static void main(String[] args) {

		for(int counter = 0;counter<=21;counter++)
			System.out.printf("%d! = %d\n",counter,fatorial(counter));

	}

}
