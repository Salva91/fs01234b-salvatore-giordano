package epicode.u5d8hw.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@ToString
@Entity
@Table(name = "blogposts")
public class Blogpost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private double readingTime;

    @ManyToOne
    @JoinColumn(name = "authorId")
    private Author author;

	public void setReadingTime(Object readingTime2) {
		// TODO Auto-generated method stub
		
	}

	public void setContent(Object content2) {
		// TODO Auto-generated method stub
		
	}

	public void setTitle(Object title2) {
		// TODO Auto-generated method stub
		
	}

	public void setAuthor(Author author2) {
		// TODO Auto-generated method stub
		
	}

	public void setCategory(Object category2) {
		// TODO Auto-generated method stub
		
	}

	 public void setCover(String string) {
		// TODO Auto-generated method stub
		
	}

	public Object getAuthor() {
		// TODO Auto-generated method stub
		return null;
	}
}
