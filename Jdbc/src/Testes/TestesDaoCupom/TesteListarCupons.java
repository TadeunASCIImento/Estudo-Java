package br.com.testes;

import java.util.List;

import br.com.controllers.ControllerCupom;
import br.com.entities.Entitie;

public class TesteListarCupons {

	public static void main(String[] args) {

		ControllerCupom controller = new ControllerCupom();
		List<Entitie> listaCupons = (List<Entitie>) controller.listarCupons();

		if (!listaCupons.isEmpty()) {
			for (Entitie cupon : listaCupons)
				System.out.println(cupon.toString());
		} else {
			System.out.println("Lista vazia");
		}

	}

}
