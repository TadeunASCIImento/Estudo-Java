package br.com.tratamento.execoes;

public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (Exception e) {
			String mensagem = e.getMessage();
			System.out.println("ArithmeticException " + mensagem);
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");

	}

	private static void metodo2() {
		System.out.println("Inicio do metodo2");
		throw new MinhaException("deu muito errado!");
		//System.out.println("Fim do metodo2");

	}
}
