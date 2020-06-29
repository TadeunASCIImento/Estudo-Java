package br.com.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class JpaUtil {

	private static final String PERSISTENCE_UNIT = "pessoasPU";
	private static ThreadLocal<EntityManager> threadEntityManager = new ThreadLocal<EntityManager>();
	private static EntityManagerFactory factory;

	public static EntityManager getEntityManager() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
		}
		EntityManager manager = threadEntityManager.get();
		if (manager == null || manager.isOpen()) {
			manager = factory.createEntityManager();
			JpaUtil.threadEntityManager.set(manager);
		}
		return manager;
	}

	public void closeEntityManager() {
		EntityManager manager = threadEntityManager.get();
		if (manager != null) {
			EntityTransaction transaction = manager.getTransaction();
			if (transaction.isActive()) {
				transaction.commit();
			}
			manager.close();
			threadEntityManager.set(null);
		}
	}

	public void closeEntityManagerFactory() {
		closeEntityManager();
		factory.close();
	}

}
