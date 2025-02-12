package it.epicode.gestioneDispositivi.entities;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Table(name = "dipendenti")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dipendente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    @NotBlank
    @NotNull

    private String username;


    @NotBlank
    @NotNull

    private String nome;

    @NotBlank
    @NotNull

    private String cognome;

    @NotBlank
    @NotNull
    @Email

    private String email;
@OneToMany(mappedBy = "dipendente")
private List<Dispositivo> dispositivi;
public Object getEmail() {
	// TODO Auto-generated method stub
	return null;
}
public void setEmail(Object email2) {
	// TODO Auto-generated method stub
	
}
public Object getNome() {
	// TODO Auto-generated method stub
	return null;
}
public void setNome(Object nome2) {
	// TODO Auto-generated method stub
	
}
public Object getCognome() {
	// TODO Auto-generated method stub
	return null;
}
public void setCognome(Object cognome2) {
	// TODO Auto-generated method stub
	
}
public Object getUserName() {
	// TODO Auto-generated method stub
	return null;
}
public void setUserName(Object userName2) {
	// TODO Auto-generated method stub
	
}
public void setPathImmagine(String imagePath) {
	// TODO Auto-generated method stub
	
}

}
