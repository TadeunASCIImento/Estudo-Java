package br.com.controllers;

import java.util.List;

import br.com.dao.DaoCupom;
import br.com.entities.Entitie;

public class ControllerCupom {

	public static boolean cadastrarCupom(Entitie entitie) {
		return new DaoCupom().add(entitie);

	}

	public static boolean excluirCupom(int id) {
		return new DaoCupom().delete(id);

	}

	public static Entitie buscarCupom(int id) {
		return new DaoCupom().findOne(id);

	}

	public static List<Entitie> listarCupons() {
		List<Entitie> listaCupons = new DaoCupom().findAll();
		return listaCupons;

	}

	public static boolean atualizarCupom(Entitie entitie) {
		return new DaoCupom().update(entitie);

	}

}
