package epicode.u5d8hw.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;
    private String dateOfBirth;
    private String avatar;
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setAvatar(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setEmail(String email2) {
		// TODO Auto-generated method stub
		
	}
	public void setName(String name2) {
		// TODO Auto-generated method stub
		
	}
	public void setSurname(String name2) {
		// TODO Auto-generated method stub
		
	}
	public Object getDateOfBirth() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setDateOfBirth(Object dateOfBirth2) {
		// TODO Auto-generated method stub
		
	}
	public String getAvatar() {
		// TODO Auto-generated method stub
		return null;
	}

/* Per evitare lo stackoverflow error che avviene quando si manda un Author come risposta (può avvenire anche quando mandiamo un BlogPost con un Author)
   si può o togliere la bidirezionalità, oppure usare @JsonIgnore, oppure farsi un payload di risposta custom.
  @OneToMany(mappedBy = "author", cascade = CascadeType.REMOVE)
    @JsonIgnore
    List<Blogpost> blogpostList;*/
}
