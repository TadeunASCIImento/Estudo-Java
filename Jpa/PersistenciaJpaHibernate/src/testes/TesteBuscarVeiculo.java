package br.com.loja.testes;

import javax.swing.JOptionPane;

import br.com.loja.controllers.ControllerVeiculo;
import br.com.loja.entidades.Veiculo;

public class TesteBuscarVeiculo {

	public static void main(String[] args) {

		ControllerVeiculo controllerVeiculo = new ControllerVeiculo();

		Veiculo veiculo = (Veiculo) controllerVeiculo.buscarVeiculo(3L);

		if (veiculo.equals(null))

			JOptionPane.showMessageDialog(null, "Veículo não localizado.");
		else
			System.out.println(veiculo.getProprietario().toString());

		System.out.println(veiculo.toString());

	}

}
