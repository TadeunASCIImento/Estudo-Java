package br.com.loja.testes;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

import br.com.loja.controllers.ControllerProprietario;
import br.com.loja.controllers.ControllerVeiculo;
import br.com.loja.entidades.Proprietario;
import br.com.loja.entidades.Veiculo;

public class TesteInserirVeiculo {
	private static final String MESSAGE_ERROR = "Erro ao cadastrar veículo.";
	private static final String MESSAGE_SUCCESS = "Veículo cadastrado com sucesso.";

	public static void main(String[] args) {

		ControllerProprietario controllerProprietario = new ControllerProprietario();
		Proprietario proprietario = (Proprietario) controllerProprietario.buscarProprietario(1L);
		Veiculo veiculo1 = new Veiculo();
		veiculo1.setFabricante("Fiat");
		veiculo1.setModelo("Palio");
		veiculo1.setCor("Prata");
		veiculo1.setAnoFabricacao(2015);
		veiculo1.setAnoModelo(2016);
		veiculo1.setPreco(new BigDecimal(32000));
		veiculo1.setProprietario(proprietario);

		ControllerVeiculo controllerVeiculo = new ControllerVeiculo();
		if (controllerVeiculo.inserirVeiculo(veiculo1))
			JOptionPane.showMessageDialog(null,MESSAGE_SUCCESS );
		else
			JOptionPane.showMessageDialog(null,MESSAGE_ERROR);

		Veiculo veiculo2 = new Veiculo();
		veiculo2.setFabricante("Ford");
		veiculo2.setModelo("Fiesta");
		veiculo2.setCor("Vermelho");
		veiculo2.setAnoFabricacao(2015);
		veiculo2.setAnoModelo(2016);
		veiculo2.setPreco(new BigDecimal(42000));
		veiculo2.setProprietario(proprietario);

		if (controllerVeiculo.inserirVeiculo(veiculo2))
			JOptionPane.showMessageDialog(null,MESSAGE_SUCCESS);
		else
			JOptionPane.showMessageDialog(null,MESSAGE_ERROR);
		try {
			controllerVeiculo.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
