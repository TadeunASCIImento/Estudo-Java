package br.com.dao;

import java.util.List;

import br.com.entities.Entitie;

public interface DaoFunctions {

	public boolean add(Entitie entitie) throws Exception;

	public boolean delete(int id) throws Exception;

	public boolean update(Entitie entitie) throws Exception;

	public Entitie findOne(int id) throws Exception;

	public List<Entitie> findAll() throws Exception;

}
