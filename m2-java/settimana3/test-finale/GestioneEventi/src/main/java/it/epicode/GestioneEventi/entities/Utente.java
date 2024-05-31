package it.epicode.GestioneEventi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Entity
@Table(name = "users")
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
public class Utente extends BaseEntity{
    @EqualsAndHashCode.Include
    private String username;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    @OneToMany (mappedBy = "evento")
    private List<Prenotazione> prenotazioni;
}
