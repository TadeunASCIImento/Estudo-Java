package br.com.daos;

import java.util.List;

import br.com.loja.entidades.Entidade;

public interface FuncoesDao {

	boolean add(Entidade entidade) throws Exception;

	Entidade find(Long id) throws Exception;

	boolean delete(Long id) throws Exception;

	boolean update(Entidade entidade) throws Exception;

	List<?> findAll() throws Exception;

	boolean close() throws Exception;

}
