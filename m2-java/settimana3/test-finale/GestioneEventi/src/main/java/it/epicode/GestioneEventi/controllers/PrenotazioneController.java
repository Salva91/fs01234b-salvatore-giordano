package it.epicode.GestioneEventi.controllers;

import it.epicode.GestioneEventi.entities.Prenotazione;
import it.epicode.GestioneEventi.services.PrenotazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prenotazioni")
public class PrenotazioneController {
    @Autowired
    private PrenotazioneService prenotazioneService;

    @PostMapping
    @PreAuthorize("hasRole('UTENTE')")
    public ResponseEntity<Prenotazione> createBooking(@RequestBody Prenotazione prenotazione) {
        return ResponseEntity.ok(prenotazioneService.save(prenotazione));
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('UTENTE')")
    public ResponseEntity<Prenotazione> getBookingById(@PathVariable Long id) {
        return ResponseEntity.of(prenotazioneService.findById(id));
    }

    @GetMapping("/utente/{utenteId}")
    @PreAuthorize("hasRole('UTENTE')")
    public ResponseEntity<List<Prenotazione>> getBookingsByUserId(@PathVariable Long utenteId) {
        return ResponseEntity.ok(prenotazioneService.findByUtenteId(utenteId));
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('UTENTE')")
    public ResponseEntity<Void> deleteBooking(@PathVariable Long id) {
        if (!prenotazioneService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        prenotazioneService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
