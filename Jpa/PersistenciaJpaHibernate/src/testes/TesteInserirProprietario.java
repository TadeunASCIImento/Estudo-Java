package br.com.loja.testes;

import javax.swing.JOptionPane;

import br.com.loja.controllers.ControllerProprietario;
import br.com.loja.entidades.Proprietario;

public class TesteInserirProprietario {

	public static void main(String[] args) {


		Proprietario proprietario = new Proprietario();

		proprietario.setNome("Tadeu");
		proprietario.setSobrenome("Nascimento");
		proprietario.setCpf("11122233344");
		proprietario.setEmail("tadeunascimento@hotmail.com");
		proprietario.setTelefone("(11)99999-9999");

		ControllerProprietario controllerProprietario = new ControllerProprietario();

		if (controllerProprietario.cadastrarProprietario(proprietario))

			JOptionPane.showMessageDialog(null, "Cadastro OK!");
		else

			JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");

	}

}
