package it.epicode.GestioneEventi.repositories;

import it.epicode.GestioneEventi.entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}

