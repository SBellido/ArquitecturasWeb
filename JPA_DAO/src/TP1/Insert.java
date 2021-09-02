package TP1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Insert {
	Connection connection;

	public Insert(Object data) {
		this.connection = new Connection();
		this.insert(data);
	}
	
	private void insert(Object data) {
		EntityManager em = this.connection.getEm();
//		em.getTransaction().begin();
//		em.persist(data);
//		em.getTransaction().commit();
		this.runQuery(em, data);		
		this.connection.closeBBDD();	
	}
	

	private void runQuery(EntityManager em, Object data) {
		em.getTransaction().begin();
		em.persist(data);
		em.getTransaction().commit();
	}

}
