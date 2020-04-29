package br.com.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.loja.entidades.Entidade;
import br.com.loja.entidades.Veiculo;

public class VeiculoDao implements FuncoesDao {

	private static EntityManagerFactory factory =
			Persistence.createEntityManagerFactory("veiculoPU");
	private static EntityManager manager = factory.createEntityManager();
	private static EntityTransaction transaction = manager.getTransaction();

	@Override
	public boolean add(Entidade entidade) throws Exception {
		Veiculo veiculo = (Veiculo) entidade;
		transaction.begin();
		manager.persist(veiculo);
		transaction.commit();
		return true;
	}

	@Override
	public Veiculo find(Long id) throws Exception {
		Veiculo veiculo = manager.find(Veiculo.class, id);
		return veiculo;
	}

	@Override
	public boolean delete(Long id) throws Exception {
		Veiculo veiculo = manager.find(Veiculo.class, id);
		transaction.begin();
		manager.remove(veiculo);
		transaction.commit();
		return true;
	}

	@Override
	public boolean update(Entidade entidade) throws Exception {
		Veiculo veiculo = (Veiculo) entidade;
		Veiculo atualizacao = manager.find(Veiculo.class, veiculo.getId());
		atualizacao.setFabricante(veiculo.getFabricante());
		atualizacao.setModelo(veiculo.getModelo());
		atualizacao.setCor(veiculo.getCor());
		atualizacao.setAnoFabricacao(veiculo.getAnoFabricacao());
		atualizacao.setAnoModelo(veiculo.getAnoModelo());
		atualizacao.setPreco(veiculo.getPreco());
		atualizacao.setProprietario(veiculo.getProprietario());
		transaction.begin();
		manager.persist(atualizacao);
		transaction.commit();
		return true;
	}

	@Override
	public List<?> findAll() throws Exception {
		List<?> listaVeiculos;
		listaVeiculos = manager.createQuery("from Veiculo", Veiculo.class).getResultList();
		return listaVeiculos;
	}

	@Override
	public boolean close() throws Exception {
		manager.close();
		factory.close();
		return false;
	}

}
