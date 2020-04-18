package br.com.loja.util;

import javax.persistence.Persistence;

public class GeradorTabelas {

	public static void main(String[] args) {

		Persistence.createEntityManagerFactory("veiculoPU");

		Persistence.createEntityManagerFactory("proprietarioPU");
	}

}
