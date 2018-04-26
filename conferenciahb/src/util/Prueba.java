package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Participante;

public class Prueba {

	public static void main(String[] args) {
		Participante n = new Participante();
		n.setEmail("emailx");
		n.setEstado("activo");
		n.setNombre("nombrex");
		n.setTelefono("telefonox");
		
		EntityManagerFactory emf =
		Persistence.createEntityManagerFactory("conferenciahb");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(n);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
		}
	}

}
