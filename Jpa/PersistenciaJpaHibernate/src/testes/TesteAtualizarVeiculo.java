package br.com.loja.testes;

import java.math.BigDecimal;
import javax.swing.JOptionPane;
import br.com.loja.controllers.ControllerVeiculo;
import br.com.loja.entidades.Veiculo;

public class TesteAtualizarVeiculo {

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo();
		veiculo.setId(1L);
		veiculo.setFabricante("Volkswagen");
		veiculo.setModelo("Polo");
		veiculo.setCor("Cinza");
		veiculo.setAnoFabricacao(2021);
		veiculo.setAnoModelo(2022);
		veiculo.setPreco(new BigDecimal(79000));

		ControllerVeiculo controllerVeiculo = new ControllerVeiculo();
		if (controllerVeiculo.atualizarVeiculo(veiculo))
			JOptionPane.showMessageDialog(null, "Atualizacão OK.");
		else
			JOptionPane.showMessageDialog(null, "Erro ao atualizar");
	}

}
