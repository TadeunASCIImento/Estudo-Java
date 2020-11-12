package br.com.tadeu.banco;

public class ContaPoupanca extends ContaServico {

	public ContaPoupanca(Integer numero, Integer agencia, Cliente titular) {
		super(numero, agencia, titular);
		this.senha = 12345;
	}

}
