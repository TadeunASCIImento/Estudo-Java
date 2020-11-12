package br.com.tadeu.banco;

import java.math.BigDecimal;

public class TesteConta {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("111222333", "Tadeu");
		ContaCorrente cc1 = new ContaCorrente(234, 5678, c1);

		cc1.deposita(new BigDecimal(200.00));
		System.out.println("CC1 saldo: " + cc1.getSaldo().doubleValue());

		double saque = 89.90;
		cc1.saca(new BigDecimal(saque));
		System.out.println("CC1 Saque: " + saque);
		System.out.println("CC1: " + cc1.getSaldo().doubleValue());

		Cliente c2 = new Cliente("444555666", "Anielka");
		ContaPoupanca cp1 = new ContaPoupanca(234, 9012, c2);

		cp1.deposita(new BigDecimal(350.00));
		System.out.println("CP1 saldo: " + cp1.getSaldo().doubleValue());

		cp1.saca(new BigDecimal(saque));
		System.out.println("CP1 Saque: " + saque);
		System.out.println("CP1: " + cp1.getSaldo().doubleValue());

	}

}
