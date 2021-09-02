package TP1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {	
	EntityManagerFactory emf;
	EntityManager em;
	
	public Connection() {
		this.connect();
	}
	
	private void connect() {
		this.emf = Persistence.createEntityManagerFactory("Example");
		this.em = this.emf.createEntityManager();
	}
	
	public void closeBBDD() { 
		this.em.close();
		this.emf.close();
	}
	
//	public EntityManagerFactory getEmf() {
//		return emf;
//	}

	public EntityManager getEm() {
		return em;
	}

	
}
