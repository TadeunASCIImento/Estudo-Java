package br.com.testes;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import br.com.controllers.VeiculoController;
import br.com.entidades.Entidade;
import br.com.entidades.Veiculo;

public class TesteVeiculoController extends VeiculoController {

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 - Inserir  2 - Excluir 3 - Visualizar 4 - Atualizar  5 - Listar");
		int opcao = scanner.nextInt();

		switch (opcao) {
		case 1:
			veiculo.setMarca("Evolution");
			veiculo.setModelo("Venus6");
			veiculo.setAnoFabricacao(2049);
			veiculo.setAnoModelo(2050);
			veiculo.setPreco(new BigDecimal(52000));
			if (inserirVeiculo(veiculo))
				System.out.println("Inserção realizada com sucesso.");
			else
				System.out.println("Falha na inserção dos dados.");
			break;

		case 2:

			System.out.println("Informe o código?");
			Long codigo = scanner.nextLong();

			if (excluirVeiculo(codigo))
				System.out.println("Exclusão realizada com sucesso.");
			else
				System.out.println("Falha ao tentar excluir");
			break;

		case 3:
			System.out.println("Informe o código? ");
			long codigoVeiculo = scanner.nextLong();
			veiculo = buscarVeiculo(codigoVeiculo);
			if (veiculo != null)
				System.out.println(veiculo.toString());
			else
				System.out.println("Veículo não localizado.");
			break;

		case 4:
			atualizarVeiculo(3L);
			break;

		case 5:
			List<Entidade> lista = listarVeiculos();
			for (Entidade entidade : lista) {
				veiculo = (Veiculo) entidade;
				System.out.println(veiculo.toString());
			}
			break;

		default:
			break;
		}
		scanner.close();
	}
}
