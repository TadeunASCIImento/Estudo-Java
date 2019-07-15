package br.com.estudo;

public class metodoPolimorfico {

	public static void main(String args[]) {

		System.out.println(somar(2.0, 9.0, 7.8, 9.3));
		System.out.println(somar(2.5, 6.7, 12.4, 67.0, 23.0, 45, 90));
		System.out.println(somar(2, 7));
		System.out.println(somar("Tadeu", "Nascimento"));
	}

	public static double somar(double... numeros) {
		double total = 0.0;
		for (double nums : numeros)
			total += nums;
		return total;
	}

	public static int somar(int x, int y) {
		return x + y;
	}

	public static String somar(String nome, String sobrenome) {
		return String.format("Nome: " + nome + " Sobrenome: " + sobrenome);

	}

}
