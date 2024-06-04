package epicode.entities;

import javax.persistence.*;

@Entity
@Table(name = "partecipazioni")
public class Participation {
	@Id
	@GeneratedValue
	private long id;

	@ManyToOne
	@JoinColumn(name = "persona_id")
	private Person person;

	@ManyToOne
	@JoinColumn(name = "evento_id")
	private Event event;

	@Enumerated(EnumType.STRING)
	private ParticipationStatus status;

	public Participation() {
	}

	public Participation(Person person, Event event) {
		this.person = person;
		this.event = event;
		this.status = ParticipationStatus.PENDING;
	}

	public long getId() {
		return id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public ParticipationStatus getStatus() {
		return status;
	}

	public void setStatus(ParticipationStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Participation{" +
				"id=" + id +
				", person=" + person +
				", event=" + event +
				", status=" + status +
				'}';
	}
}
