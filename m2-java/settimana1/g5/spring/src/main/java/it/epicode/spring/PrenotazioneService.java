package it.epicode.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;
    @Autowired
    private PostazioneRepository postazioneRepository;

    public Prenotazione prenotaPostazione(String username, String nomeCompleto, String email, Long postazioneId, LocalDate dataPrenotazione) {
        Postazione postazione = postazioneRepository.findById(postazioneId).orElseThrow(() -> new IllegalArgumentException("Postazione non trovata"));
        
        List<Prenotazione> prenotazioni = prenotazioneRepository.findByPostazioneAndDataPrenotazione(postazione, dataPrenotazione);
        if (!prenotazioni.isEmpty()) {
            throw new IllegalStateException("Postazione già prenotata per questa data");
        }

        Prenotazione prenotazione = new Prenotazione();
        prenotazione.setUsername(username);
        prenotazione.setNomeCompleto(nomeCompleto);
        prenotazione.setEmail(email);
        prenotazione.setPostazione(postazione);
        prenotazione.setDataPrenotazione(dataPrenotazione);

        return prenotazioneRepository.save(prenotazione);
    }
}

