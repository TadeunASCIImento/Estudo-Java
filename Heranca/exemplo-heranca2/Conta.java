package br.com.tadeu.banco;

import java.math.BigDecimal;

public abstract class Conta {

	public Integer numero;
	public Integer agencia;
	public BigDecimal saldo;
	public Cliente titular;
	public Integer senha;

	public Conta(Integer numero, Integer agencia, Cliente cliente) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = new BigDecimal(0);
		this.titular = cliente;
	}

}
