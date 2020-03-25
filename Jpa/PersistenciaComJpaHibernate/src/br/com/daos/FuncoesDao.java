package br.com.daos;

import java.util.List;

import br.com.entidades.Entidade;
import br.com.entidades.Veiculo;

public interface FuncoesDao {

	public boolean add(Entidade entidade);

	public boolean delete(Long codigo);

	public boolean update(Long codigo);

	public Veiculo findOne(Long codigo);

	public List<Entidade> findAll();

}
