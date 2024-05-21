package repositories;

import entita.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;


import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione,Long> {

    List<Prenotazione> findByPostazioneIdAndDataPrenotazione(Long postazioneId, LocalDate dataPrenotazione);
    List<Prenotazione> findByUtenteIdAndDataPrenotazione(Long utenteId, LocalDate dataPrenotazione);


}