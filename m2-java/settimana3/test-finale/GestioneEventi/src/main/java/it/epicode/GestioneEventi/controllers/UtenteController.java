package it.epicode.GestioneEventi.controllers;

import it.epicode.GestioneEventi.entities.Utente;
import it.epicode.GestioneEventi.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/utenti")
public class UtenteController {
    @Autowired
    private UtenteService utenteService;

    @PostMapping("/register")
    public ResponseEntity<Utente> register(@RequestBody Utente utente) {
        return ResponseEntity.ok(utenteService.save(utente));
    }

    @GetMapping("/{username}")
    public ResponseEntity<Utente> getUserByUsername(@PathVariable String username) {
        return ResponseEntity.of(utenteService.findByUsername(username));
    }
}

