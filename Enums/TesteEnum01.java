package br.com.estudo;

import java.util.EnumSet;

public class TesteEnum01 {

	public static void main(String[] args) {

		System.out.println("Tipos de combústível dos veículos:");

		// percorre a enum e armazena os valores em trspt.
		for (Transporte trspt : Transporte.values())

			// mostra o conteúdo em trspt
			System.out.println("( " + trspt + " -> " + trspt.getTipo() + " )");

		// percorre a enum utilizando um enumSet
		for (Transporte trspt : EnumSet.range(Transporte.CARRO, Transporte.MOTO))
			System.out.println("\n( " + trspt + " -> " + trspt.getTipo() + " )");

		// percorre a enum utilizando um enumSet
		for (Transporte trspt : EnumSet.range(Transporte.CARRO, Transporte.BARCO))
			System.out.println("\n( " + trspt + " -> " + trspt.getTipo() + " )");

	}

}

/* INICIO DA ENUM Transporte */
enum Transporte {

	// declara as constantes enum CARRO,AVIAO,BARCO,MOTO
	CARRO("Etanol"), AVIAO("Querosene"), BARCO("Oléo Diesel"), MOTO("Gasolina");

	// String passada para a constante.
	private String tipoCombustivel;

	// construtor da enum.
	private Transporte(String tipo) {
		this.tipoCombustivel = tipo;

	}

	// metodo de acesso ao contéudo da constante.
	public String getTipo() {
		return tipoCombustivel;
	}

}
