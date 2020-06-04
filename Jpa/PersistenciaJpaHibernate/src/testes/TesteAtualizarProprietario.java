package br.com.loja.testes;

import javax.swing.JOptionPane;

import br.com.loja.controllers.ControllerProprietario;
import br.com.loja.entidades.Proprietario;

public class TesteAtualizarProprietario {

	public static void main(String[] args) {

		Proprietario proprietario = new Proprietario();

		proprietario.setId(1L);
		proprietario.setNome("Tadeu");
		proprietario.setSobrenome("do Nascimento");
		proprietario.setCpf("22233344455");
		proprietario.setEmail("tadeunascimento@gmail.com");
		proprietario.setTelefone("(11)8888-8888");

		ControllerProprietario controllerProprietario = new ControllerProprietario();

		if (controllerProprietario.atulizarProprietario(proprietario))

			JOptionPane.showMessageDialog(null, "Cadastro atualizado.");
		else
			JOptionPane.showMessageDialog(null, "Erro ao atualizar cadastro.");

	}

}
