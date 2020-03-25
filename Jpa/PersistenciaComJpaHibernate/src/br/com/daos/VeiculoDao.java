package br.com.daos;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import br.com.entidades.Entidade;
import br.com.entidades.Veiculo;

public class VeiculoDao implements FuncoesDao {

	private static EntityManagerFactory factory;

	static {
		factory = Persistence.createEntityManagerFactory("VeiculoPU");
	}
	private static EntityManager manager = factory.createEntityManager();

	private static EntityTransaction transaction = manager.getTransaction();

	@Override
	public boolean add(Entidade entidade) {
		Veiculo veiculo = (Veiculo) entidade;
		try {
			transaction.begin();
			manager.persist(veiculo);
			transaction.commit();
			return true;
		} catch (NullPointerException exc) {
			exc.printStackTrace();
			return false;

		} finally {
			manager.close();
			factory.close();
		}

	}

	@Override
	public boolean delete(Long codigo) {
		try {
			transaction.begin();
			Veiculo veiculo = manager.find(Veiculo.class, codigo);
			manager.remove(veiculo);
			transaction.commit();
			return true;
		} catch (NullPointerException exc) {
			exc.printStackTrace();
			return false;
		} finally {
			manager.close();
			factory.close();
		}

	}

	@Override
	public Veiculo findOne(Long codigo) {
		try {
			transaction.begin();
			Veiculo veiculo = manager.find(Veiculo.class, codigo);
			return veiculo;
		} catch (NullPointerException exc) {
			System.out.println();
		} finally {
			manager.close();
			factory.close();
		}
		return null;
	}

	@Override
	public boolean update(Long codigo) {

		try {
			transaction.begin();
			Veiculo veiculo = manager.find(Veiculo.class, codigo);
			veiculo.setMarca("Honda");
			veiculo.setModelo("Civic");
			veiculo.setAnoFabricacao(2020);
			veiculo.setAnoModelo(2021);
			veiculo.setPreco(new BigDecimal(97900));
			manager.persist(veiculo);
			transaction.commit();
			return true;
		} catch (NullPointerException exc) {
			exc.printStackTrace();
			return false;

		} finally {
			manager.close();
			factory.close();
		}

	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Entidade> findAll() {
		try {
			transaction.begin();
			List<Entidade> lista = manager.createQuery("from tab_veiculos_passeio").getResultList();
			return lista;
		} catch (NullPointerException exc) {
			exc.printStackTrace();

		} finally {
			manager.close();
			factory.close();
		}
		return null;
	}

}
