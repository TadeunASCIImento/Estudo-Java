package br.com.java.io;

import java.io.Serializable;

public class Produto implements Serializable {

	private static final long serialVersionUID = -1839051983641370338L;

	private final Long codigo;
	private final  String nome;
	private final Double valor;

	public Produto(Long codigo, String nome, Double valor) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return String.format("Produto codigo %s, nome %s, valor %s", codigo, nome, valor);
	}

}
