package epicode.entities;

import javax.persistence.*;

@Entity
@Table(name = "locations")
public class Location {
	@Id
	@GeneratedValue
	private long id;

	private String name;
	private String city;

	public Location() {
	}

	public Location(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Location{" +
				"id=" + id +
				", name='" + name + '\'' +
				", city='" + city + '\'' +
				'}';
	}
}
