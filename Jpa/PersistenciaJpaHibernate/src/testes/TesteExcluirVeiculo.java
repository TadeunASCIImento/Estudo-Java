package br.com.loja.testes;

import javax.swing.JOptionPane;

import br.com.loja.controllers.ControllerVeiculo;

public class TesteExcluirVeiculo {

	public static void main(String[] args) {

		ControllerVeiculo controllerVeiculo = new ControllerVeiculo();

		if (controllerVeiculo.excluirVeiculo(1L))

			JOptionPane.showMessageDialog(null, "Veículo excluído com sucesso.");
		else
			JOptionPane.showMessageDialog(null, "Falha ao tentar excluír.");
	}
}
