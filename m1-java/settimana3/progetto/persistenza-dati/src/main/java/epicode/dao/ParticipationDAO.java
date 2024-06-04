package epicode.dao;

import epicode.entities.Participation;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ParticipationDAO {
	private EntityManager em;

	public ParticipationDAO(EntityManager em) {
		this.em = em;
	}

	public void save(Participation participation) {
		try {
			EntityTransaction t = em.getTransaction();
			t.begin();
			em.persist(participation);
			t.commit();
			System.out.println("Participation for event " + participation.getEvent() + " by person " + participation.getPerson().getLastName() + " created.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Participation findById(long id) {
		return em.find(Participation.class, id);
	}

	public void findByIdAndDelete(long id) {
		try {
			EntityTransaction t = em.getTransaction();
			t.begin();
			Participation found = em.find(Participation.class, id);
			if (found != null) {
				em.remove(found);
				t.commit();
				System.out.println("Participation deleted.");
			} else {
				System.out.println("Participation not found.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
