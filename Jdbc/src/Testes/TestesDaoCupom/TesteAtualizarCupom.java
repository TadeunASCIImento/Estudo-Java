package br.com.testes;

import javax.swing.JOptionPane;

import br.com.controllers.ControllerCupom;
import br.com.entities.Cupom;

public class TesteAtualizarCupon {

	public static void main(String[] args) {

		Cupom cupomAtualizado = new Cupom();

		cupomAtualizado.setId(3);
		cupomAtualizado.setCodCupom(1007);
		cupomAtualizado.setDescricao("Monitor Genérico \"19.5\"");
		cupomAtualizado.setNumPontos(300);

		ControllerCupom controller = new ControllerCupom();

		if (controller.atualizarCupom(cupomAtualizado))

			JOptionPane.showMessageDialog(null, "Atualizado cupom com sucesso!");
		else
			JOptionPane.showMessageDialog(null, "Erro ao atualizar cupom!");

	}

}
