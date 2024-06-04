package epicode.dao;

import epicode.entities.Location;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class LocationDAO {
	private EntityManager em;

	public LocationDAO(EntityManager em) {
		this.em = em;
	}

	public void save(Location location) {
		try {
			EntityTransaction t = em.getTransaction();
			t.begin();
			em.persist(location);
			t.commit();
			System.out.println("Location - " + location.getName() + " - created!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public Location findById(long id) {
		return em.find(Location.class, id);
	}

	public void findByIdAndDelete(long id) {
		try {
			EntityTransaction t = em.getTransaction();
			t.begin();
			Location found = em.find(Location.class, id);
			if (found != null) {
				em.remove(found);
				t.commit();
				System.out.println("Location deleted.");
			} else {
				System.out.println("Location not found.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
