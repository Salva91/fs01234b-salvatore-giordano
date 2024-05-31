package it.epicode.GestioneEventi.services;

import it.epicode.GestioneEventi.entities.Utente;
import it.epicode.GestioneEventi.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Utente save(Utente utente) {
        utente.setPassword(passwordEncoder.encode(utente.getPassword()));
        return utenteRepository.save(utente);
    }

    public Optional<Utente> findByUsername(String username) {
        return Optional.ofNullable(utenteRepository.findByUsername(username));
    }

    public Optional<Utente> findById(Long id) {
        return utenteRepository.findById(id);
    }


}


