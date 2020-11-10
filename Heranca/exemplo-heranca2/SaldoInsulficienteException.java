package br.com.tadeu.banco;

public class SaldoInsulficienteException extends RuntimeException {
	private static final long serialVersionUID = -5926928696971550192L;

	public SaldoInsulficienteException() {
		super("Saldo inferior ao valor do saque!");
	}

}
