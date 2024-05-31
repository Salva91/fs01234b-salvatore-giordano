package it.epicode.GestioneEventi.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Entity
@Table(name = "bookings")
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
public class Prenotazione extends BaseEntity {
    @ManyToOne
    private Utente utente;
    @ManyToOne
    private Evento evento;
}

