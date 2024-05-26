package it.epicode.gestioneDispositivi.entities;

import it.epicode.gestioneDispositivi.enums.StatoDispositivo;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "dispositivi")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dispositivo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
	
	private String tipologia;
	
	@Enumerated (EnumType.STRING)
	private StatoDispositivo stato;
	@ManyToOne
	private Dipendente dipendente;
	public void setStato(StatoDispositivo dispositivo) {
		// TODO Auto-generated method stub
		
		
	}
	public StatoDispositivo getStato() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getTipologia() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setTipologia(Object tipologia2) {
		// TODO Auto-generated method stub
		
	}
	public Object getDipendente() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setDipendente(Object dipendente2) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
