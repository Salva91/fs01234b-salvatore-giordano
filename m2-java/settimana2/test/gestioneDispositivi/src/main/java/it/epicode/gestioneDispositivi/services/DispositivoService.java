package it.epicode.gestioneDispositivi.services;

import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import it.epicode.gestioneDispositivi.entities.Dispositivo;
import it.epicode.gestioneDispositivi.enums.StatoDispositivo;
import it.epicode.gestioneDispositivi.exceptions.NotFoundException;
import it.epicode.gestioneDispositivi.repositories.DispositivoRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class DispositivoService {
	@Autowired 
	 private DispositivoRepository dispositivoRepository;
	
	public Dispositivo save (Dispositivo body) {
		body.setStato(StatoDispositivo.ASSEGNATO);
		return dispositivoRepository.save(body);

}
	
	public Page<Dispositivo> getDispositivi1(int page, int size, String sort) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sort));
        return dispositivoRepository.findAll(pageable);
	
	
}
	 public Dispositivo findById(Long id){
	        return dispositivoRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
	    }

	    public void findByIdAndDelete(Long id){
	        Dispositivo found = this.findById(id);
	        dispositivoRepository.delete(found);
	    }

	    public Dispositivo findByIdAndUpdate(Long id, Dispositivo body){
	        Dispositivo found = this.findById(id);
	        found.setStato(body.getStato());
	        found.setTipologia(body.getTipologia());
	        found.setStato(body.getStato());
	        found.setDipendente(body.getDipendente());
	        return dispositivoRepository.save(found);
	    }

		public Object getDispositivi(int page, int size, String sort) {
			// TODO Auto-generated method stub
			return null;
		}
	
}
