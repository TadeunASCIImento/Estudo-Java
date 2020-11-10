package br.com.tadeu.banco;

import java.math.BigDecimal;

public abstract class ContaServico extends Conta implements ContaOperacao {

	protected Integer senha;

	public ContaServico(Integer numero, Integer agencia, Cliente titular) {
		super(numero, agencia, titular);
	}

	@Override
	public BigDecimal getSaldo() {
		return this.saldo;
	}

	@Override
	public void deposita(BigDecimal valor) {
		this.saldo = this.saldo.add(valor);

	}

	@Override
	public void saca(BigDecimal valor) throws SaldoInsulficienteException {

		if (this.saldo.doubleValue() < valor.doubleValue()) {
			throw new SaldoInsulficienteException();
		} else {
			this.saldo = this.saldo.subtract(valor);
		}

	}

	@Override
	public boolean acessa(Integer senha) {
		if (this.senha != senha) {
			return false;
		}
		return true;
	}

}
