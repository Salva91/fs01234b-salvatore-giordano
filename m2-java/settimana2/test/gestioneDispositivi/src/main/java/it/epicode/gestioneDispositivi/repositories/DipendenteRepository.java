package it.epicode.gestioneDispositivi.repositories;


	import org.springframework.data.jpa.repository.JpaRepository;

import it.epicode.gestioneDispositivi.entities.Dipendente;

	public interface DipendenteRepository extends JpaRepository <Dipendente,Long>{
}
