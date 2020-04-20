package br.com.testes;

import javax.swing.JOptionPane;

import br.com.controllers.ControllerCupom;
import br.com.entities.Cupom;

public class TesteCadastrarCupom extends ControllerCupom {

	public static void main(String[] args) {

		Cupom cupom = new Cupom();
    
		cupom.setCodCupom(1005);
		cupom.setDescricao("Monitor Dell 23.9");
		cupom.setNumPontos(250);

		if (cadastrarCupom(cupom))

			JOptionPane.showMessageDialog(null, "Cupom cadastrado com sucesso.");
		else
			JOptionPane.showMessageDialog(null, "Erro ao cadastrar cupom");

	}
}
