package br.com.controllers;

import java.util.List;

import br.com.daos.VeiculoDao;
import br.com.entidades.Entidade;
import br.com.entidades.Veiculo;


public class VeiculoController {

	private static VeiculoDao veiculoDao = new VeiculoDao();

	public static boolean inserirVeiculo(Veiculo veiculo) {
		return veiculoDao.add(veiculo);
	}

	public static boolean excluirVeiculo(Long codigo) {
		return veiculoDao.delete(codigo);

	}

	public static Veiculo buscarVeiculo(Long codigo) {
		return veiculoDao.findOne(codigo);

	}

	public static boolean atualizarVeiculo(Long codigo) {
		return veiculoDao.update(codigo);

	}

	public static List<Entidade> listarVeiculos() {
		return veiculoDao.findAll();
	}
}
