package TP1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Delete {
	private Connection connection;
	
	public Delete(String query) {
		this.connection = new Connection();
		this.delete(query);
	}
		
	private void delete(String query) {
		EntityManager em = this.connection.getEm();	
		em.getTransaction().begin();
		em.createQuery(query).executeUpdate();
		this.runQuery(em);
		this.connection.closeBBDD();
	}

	private void runQuery(EntityManager em) {
		em.getTransaction().commit();
		em.getTransaction().begin();
	}

	
}
