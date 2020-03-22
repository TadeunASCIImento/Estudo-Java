package br.com.utilidades;

import javax.persistence.Persistence;

public class GeradorTabela {

	public static void main(String[] args) {

		Persistence.createEntityManagerFactory("VeiculoPU");

	}

}
