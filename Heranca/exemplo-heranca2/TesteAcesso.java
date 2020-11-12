package br.com.tadeu.banco.tests;

import java.math.BigDecimal;

import br.com.tadeu.banco.models.Cliente;
import br.com.tadeu.banco.models.ContaCorrente;

public class TesteAcesso {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("111222333", "Tadeu", 67890);

		ContaCorrente cc1 = new ContaCorrente(222, 333, c1);
		cc1.deposita(new BigDecimal(200.00));

		cc1.acessa(c1.getSenha());
		System.out.printf("Títular: %s, saldo da conta: %f", c1.getNome(), cc1.getSaldo());

	}

}
