package it.epicode.GestioneEventi.controllers;

import it.epicode.GestioneEventi.entities.Evento;
import it.epicode.GestioneEventi.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eventi")
public class EventoController {
    @Autowired
    private EventoService eventoService;

    @PostMapping
    @PreAuthorize("hasRole('ORGANIZZATORE')")
    public ResponseEntity<Evento> createEvent(@RequestBody Evento evento) {
        return ResponseEntity.ok(eventoService.save(evento));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> getEventById(@PathVariable Long id) {
        return ResponseEntity.of(eventoService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Evento>> getAllEvents() {
        return ResponseEntity.ok(eventoService.findAll());
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ORGANIZZATORE')")
    public ResponseEntity<Evento> updateEvent(@PathVariable Long id, @RequestBody Evento evento) {
        if (!eventoService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        evento.setId(id);
        return ResponseEntity.ok(eventoService.save(evento));
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ORGANIZZATORE')")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        if (!eventoService.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        eventoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

