package br.com.controllers;

import java.util.ArrayList;
import java.util.List;

import br.com.loja.daos.VeiculoDao;
import br.com.loja.entidades.Entidade;
import br.com.loja.entidades.Veiculo;

public class ControllerVeiculo extends VeiculoDao {

	public boolean inserirVeiculo(Entidade entidade) {

		Veiculo veiculo = (Veiculo) entidade;

		try {
			return this.add(veiculo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public Entidade buscarVeiculo(Long id) {

		Veiculo veiculo = new Veiculo();

		try {
			veiculo = this.find(id);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return veiculo;
	}

	public boolean excluirVeiculo(Long id) {

		try {
			return this.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public List<?> listarVeiculos() {

		List<?> listaVeiculos = new ArrayList<>();

		try {
			listaVeiculos = this.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaVeiculos;
	}

	public boolean finalizarTransacao() {

		try {
			return this.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean atualizarVeiculo(Entidade entidade) {
		try {
			return this.update(entidade);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
