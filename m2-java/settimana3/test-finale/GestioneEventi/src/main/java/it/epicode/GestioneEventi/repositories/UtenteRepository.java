package it.epicode.GestioneEventi.repositories;

import it.epicode.GestioneEventi.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, Long> {
    Utente findByUsername(String username);
}
