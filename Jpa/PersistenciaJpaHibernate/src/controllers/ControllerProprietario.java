package br.com.controllers;

import java.util.List;

import br.com.loja.daos.ProprietarioDao;
import br.com.loja.entidades.Entidade;
import br.com.loja.entidades.Proprietario;

public class ControllerProprietario extends ProprietarioDao {

	public boolean cadastrarProprietario(Entidade entidade) {

		Proprietario proprietario = (Proprietario) entidade;
		try {
			return this.add(proprietario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public Entidade buscarProprietario(Long id) {
		try {
			Proprietario proprietario = (Proprietario) this.find(id);
			return proprietario;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean excluirProprietario(Long id) {
		try {
			return this.delete(id);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public List<?> listarProprietarios() {
		List<?> listaProprietarios = null;
		try {
			listaProprietarios = this.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaProprietarios;
	}

	public boolean atulizarProprietario(Entidade entidade) {
		Proprietario proprietario = (Proprietario) entidade;
		try {
			return this.update(proprietario);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
}
