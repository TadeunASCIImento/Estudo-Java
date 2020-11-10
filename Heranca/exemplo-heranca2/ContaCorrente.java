package br.com.tadeu.banco;

public class ContaCorrente extends ContaServico {

	public ContaCorrente(Integer numero, Integer agencia, Cliente titular) {
		super(numero, agencia, titular);
		this.senha = 6789;
	}

}
