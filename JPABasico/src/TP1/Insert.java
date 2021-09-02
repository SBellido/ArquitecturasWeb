package TP1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		//"Example" se define en archivo persistence.xml <persistence-unit name="Example">
		Address address = new Address("Tandil", "Chacabuco 930");
		Address address1 = new Address("BJ", "Tucumán 31");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Example");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		// Guarda en BBDD
		em.persist(address);
		em.persist(address1);
		
		Person seba = new Person(5, "Sebastián", 41, address1);
		Person celia = new Person(6, "Celia", 38, address);
		// Guarda en BBDD
		em.persist(seba);
		em.persist(celia);
		// Commit de transacción
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
