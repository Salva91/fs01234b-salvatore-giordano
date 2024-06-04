package epicode.dao;

import epicode.entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PersonDAO {
	private EntityManager em;

	public PersonDAO(EntityManager em) {
		this.em = em;
	}

	public void save(Person person) {
		try {
			EntityTransaction t = em.getTransaction();
			t.begin();
			em.persist(person);
			t.commit();
			System.out.println(person.getFirstName() + " " + person.getLastName() + " created!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Person findById(long id) {
		return em.find(Person.class, id);
	}

	public void findByIdAndDelete(long id) {
		try {
			EntityTransaction t = em.getTransaction();
			t.begin();
			Person found = em.find(Person.class, id);
			if (found != null) {
				em.remove(found);
				t.commit();
				System.out.println("Person deleted.");
			} else {
				System.out.println("Person not found.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
