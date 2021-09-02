package TP1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Select {
	Connection connection;
	
	public Select() {
		this.connection = new Connection();
		//this.select();
	}
	
	private void select(String query) {
//		EntityManager em = this.connection.getEm();
//		@SuppressWarnings("unused") 
//		List<Object> objects = em.createQuery(query).getResultList();
//		objects.forEach(p -> System.out.println(p));
//		em.getTransaction().commit();
//		em.getTransaction().begin();
//		//emf.close();
//		em.close();
		
	}

//	private runQuery() {
//		
//	}
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Example");
//		EntityManager em  = emf.createEntityManager();
//		em.getTransaction().begin();
//		
//		Person seba = em.find(Person.class, 1);
////		System.out.println(seba);
//		// Suprime warning para esta llamada
//		@SuppressWarnings("unused") 
//		List<Address> address = em.createQuery("SELECT a FROM Address a").getResultList();
//		address.forEach(a -> System.out.println(a));
//		em.getTransaction().commit();
//		em.getTransaction().begin();
		
//		// Suprime warning para esta llamada
//		@SuppressWarnings("unused") 
//		List<Person> persons = em.createQuery("SELECT p FROM Person p").getResultList();
//		persons.forEach(p -> System.out.println(p));
//		em.getTransaction().commit();
//		em.getTransaction().begin();
//		emf.close();
//		em.close();


}
