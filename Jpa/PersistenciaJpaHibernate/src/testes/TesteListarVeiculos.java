package br.com.loja.testes;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

import br.com.loja.controllers.ControllerVeiculo;
import br.com.loja.entidades.Proprietario;
import br.com.loja.entidades.Veiculo;

public class TesteListarVeiculos {

	public static void main(String[] args) {

		ControllerVeiculo controllerVeiculo = new ControllerVeiculo();

		Set<Proprietario> setProprietario = new HashSet<>();

		List<?> listaVeiculos;

		try {

			listaVeiculos = controllerVeiculo.listarVeiculos();

			for (Object veiculo : listaVeiculos) {
				if (veiculo instanceof Veiculo) {

					setProprietario.add(((Veiculo) veiculo).getProprietario());
				}
			}

			for (Proprietario proprietario : setProprietario)

				if (proprietario.getId().equals(1L))

					System.out.println(proprietario.toString());

			for (Object veiculo : listaVeiculos)

				if (((Veiculo) veiculo).getProprietario().getId().equals(1L))

					System.out.println(((Veiculo) veiculo).toString());

		} catch (NullPointerException exc) {

			JOptionPane.showMessageDialog(null, "Sua busca retornou( 0 )resultados.");
		}

	}

}
