package TP1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Delete {

	public static void main(String[] args) {
		//"Example" se define en archivo persistence.xml <persistence-unit name="Example">
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Example");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		// Crea quary y borra contenido de tabla
		em.createQuery("DELETE FROM Person").executeUpdate();
		// Commit de transacción
		em.getTransaction().commit();
		em.getTransaction().begin();
		em.createQuery("DELETE FROM Address").executeUpdate();
		// Commit de transacción
		em.getTransaction().commit();
		em.getTransaction().begin();

		em.close();
		emf.close();

	}

}
