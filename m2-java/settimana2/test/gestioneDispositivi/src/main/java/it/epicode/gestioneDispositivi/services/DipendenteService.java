package it.epicode.gestioneDispositivi.services;

import java.awt.print.Pageable;

import org.hibernate.query.Page;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.data.domain.PageRequest;

import it.epicode.gestioneDispositivi.entities.Dipendente;
import it.epicode.gestioneDispositivi.repositories.DipendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class DipendenteService {

    public Dipendente save(Dipendente dipendente){
        return DipendenteRepository.save(dipendente);
    }

    public Page<Dipendente> getDipendenti1(int page, int size, String sort) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sort));
        return DipendenteRepository.findAll(pageable);
    }

    public Dipendente findById(Long id){
        return DipendenteRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    public void findByIdAndDelete(Long id){
        Dipendente found = this.findById(id);
        DipendenteRepository.delete(found);
    }

    public Dipendente findByIdAndUpdate(Long id, Dipendente body){
        Dipendente found = this.findById(id);
        found.setEmail(body.getEmail());
        found.setNome(body.getNome());
        found.setCognome(body.getCognome());
        found.setUserName(body.getUserName());
        return DipendenteRepository.save(found);
    }

	public Object getDipendenti(int page, int size, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

}
