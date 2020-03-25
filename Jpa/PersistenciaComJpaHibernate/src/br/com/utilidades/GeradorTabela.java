package br.com.utilidades;

import javax.persistence.Persistence;

// Cria a tabela no banco.
public class GeradorTabela {

	public static void main(String[] args) {

		Persistence.createEntityManagerFactory("VeiculoPU");

	}

}
