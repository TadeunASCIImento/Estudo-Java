package br.com.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.loja.entidades.Entidade;
import br.com.loja.entidades.Proprietario;

public class ProprietarioDao implements FuncoesDao {

	private static EntityManagerFactory factory =
			Persistence.createEntityManagerFactory("proprietarioPU");
	private static EntityManager manager = factory.createEntityManager();
	private static EntityTransaction transaction = manager.getTransaction();

	@Override
	public boolean add(Entidade entidade) throws Exception {
		Proprietario proprietario = (Proprietario) entidade;
		transaction.begin();
		manager.persist(proprietario);
		transaction.commit();
		return true;
	}

	@Override
	public Entidade find(Long id) throws Exception {
		transaction.begin();
		Proprietario proprietario = manager.find(Proprietario.class, id);
		return proprietario;
	}

	@Override
	public boolean delete(Long id) throws Exception {
		Proprietario proprietario = manager.find(Proprietario.class, id);
		transaction.begin();
		manager.remove(proprietario);
		transaction.commit();
		return true;
	}

	@Override
	public boolean update(Entidade entidade) throws Exception {
		Proprietario proprietario = (Proprietario) entidade;
		Proprietario novoProprietario =
				manager.find(Proprietario.class, proprietario.getId());
		novoProprietario.setNome(proprietario.getNome());
		novoProprietario.setSobrenome(proprietario.getSobrenome());
		novoProprietario.setCpf(proprietario.getCpf());
		novoProprietario.setEmail(proprietario.getEmail());
		novoProprietario.setTelefone(proprietario.getTelefone());
		transaction.begin();
		manager.persist(novoProprietario);
		transaction.commit();
		return true;
	}

	@Override
	public List<?> findAll() throws Exception {
		List<?> listaProprietarios;
		listaProprietarios =
				manager.createQuery("from Proprietario", Proprietario.class).getResultList();
		return listaProprietarios;
	}

	@Override
	public boolean close() throws Exception {
		manager.close();
		factory.close();
		return false;
	}

}
