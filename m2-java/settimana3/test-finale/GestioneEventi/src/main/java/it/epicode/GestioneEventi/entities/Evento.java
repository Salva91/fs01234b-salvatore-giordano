package it.epicode.GestioneEventi.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Entity
@Table(name = "events")
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
public class Evento extends BaseEntity {
    private String titolo;
    private String descrizione;
    private LocalDate data;
    private String luogo;
    private int numeroPostiDisponibili;
    private boolean disponibilita;
    @OneToMany(mappedBy = "evento")
    private List<Prenotazione> prenotazioni;

    public void setId(Long id) {
    }
}
