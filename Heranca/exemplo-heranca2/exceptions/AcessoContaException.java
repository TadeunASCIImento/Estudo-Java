package br.com.tadeu.banco.exceptions;

public class AcessoContaException extends RuntimeException {
	private static final long serialVersionUID = 2367357107228581980L;

	public AcessoContaException() {
		super("Senha incorreta tente novamente!");
	}

}
