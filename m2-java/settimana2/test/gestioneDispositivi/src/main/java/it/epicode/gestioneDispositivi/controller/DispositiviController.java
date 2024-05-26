package it.epicode.gestioneDispositivi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import it.epicode.gestioneDispositivi.entities.Dipendente;
import it.epicode.gestioneDispositivi.entities.Dispositivo;
import it.epicode.gestioneDispositivi.enums.StatoDispositivo;
import it.epicode.gestioneDispositivi.services.DipendenteService;
import it.epicode.gestioneDispositivi.services.DispositivoService;
import jakarta.validation.Valid;

public class DispositiviController {
	@Autowired
    private DispositivoService dispositivoService;
    @Autowired
    private DipendenteService dipendenteService;

    @PostMapping
    public Dispositivo createDispositivo(@Valid @RequestBody Dispositivo dispositivo) {
        return dispositivoService.save(dispositivo);
    }

    @GetMapping
    public List<Dispositivo> getAllDispositivi(@RequestParam int page, @RequestParam int size, @RequestParam String sort) {
        return dispositivoService.getDispositivi(page, size, sort).getContent();
    }

    @GetMapping("/{id}")
    public Dispositivo getDispositivoById(@PathVariable Long id) {
        return dispositivoService.findById(id);
    }

    @PutMapping("/{id}")
    public Dispositivo updateDispositivo(@PathVariable Long id, @Valid @RequestBody Dispositivo dispositivo) {
        return dispositivoService.findByIdAndUpdate(id, dispositivo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDispositivo(@PathVariable Long id) {
        dispositivoService.findByIdAndDelete(id);
        return ResponseEntity.noContent().build();
    }
    
    @PutMapping("/assign/{id}/{dipendenteId}")
    public Dispositivo assignDispositivo(@PathVariable Long id, @PathVariable Long dipendenteId) {
        Dispositivo dispositivo = dispositivoService.findById(id);
        Dipendente dipendente = dipendenteService.findById(dipendenteId);
        dispositivo.setDipendente(dipendente);
        dispositivo.setStato(StatoDispositivo.ASSEGNATO);
        return dispositivoService.findByIdAndUpdate(id, dispositivo);
    }
}


