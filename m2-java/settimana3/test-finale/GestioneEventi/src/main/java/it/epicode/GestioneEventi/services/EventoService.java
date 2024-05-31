package it.epicode.GestioneEventi.services;

import it.epicode.GestioneEventi.entities.Evento;
import it.epicode.GestioneEventi.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {
    @Autowired
    private EventoRepository eventoRepository;

    public Evento save(Evento evento) {
        return eventoRepository.save(evento);
    }

    public Optional<Evento> findById(Long id) {
        return eventoRepository.findById(id);
    }

    public List<Evento> findAll() {
        return eventoRepository.findAll();
    }

    public void deleteById(Long id) {
        eventoRepository.deleteById(id);
    }
}
