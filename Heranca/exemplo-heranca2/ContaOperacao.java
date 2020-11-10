package br.com.tadeu.banco;

import java.math.BigDecimal;

public interface ContaOperacao {

	public BigDecimal getSaldo();

	public void deposita(BigDecimal valor);

	public void saca(BigDecimal valor);

	public boolean acessa(Integer senha);

}
