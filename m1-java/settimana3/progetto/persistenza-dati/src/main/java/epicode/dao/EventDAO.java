package epicode.dao;

import epicode.entities.Event;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EventDAO {
    private EntityManager em;

    public EventDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Event event) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(event);
            t.commit();
            System.out.println("Event - " + event.getTitle() + " - created!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Event findById(long id) {
        return em.find(Event.class, id);
    }

    public void findByIdAndDelete(long id) {
        try {
            EntityTransaction t = em.getTransaction();
            Event found = em.find(Event.class, id);
            if (found != null) {
                t.begin();
                em.remove(found);
                t.commit();
                System.out.println("Event deleted.");
            } else {
                System.out.println("Event not found.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
