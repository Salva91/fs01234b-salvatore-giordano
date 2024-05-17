package it.epicode.spring;

import javax.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data

@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "with")
@Entity
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String nomeCompleto;
    private String email;
    private LocalDate dataPrenotazione;

    @ManyToOne
    private Postazione postazione;

	public void setUsername(String username2) {
		// TODO Auto-generated method stub
		
	}

	public void setNomeCompleto(String nomeCompleto2) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(String email2) {
		// TODO Auto-generated method stub
		
	}

	public void setPostazione(Postazione postazione2) {
		// TODO Auto-generated method stub
		
	}

	public void setDataPrenotazione(LocalDate dataPrenotazione2) {
		// TODO Auto-generated method stub
		
	}

 
}

