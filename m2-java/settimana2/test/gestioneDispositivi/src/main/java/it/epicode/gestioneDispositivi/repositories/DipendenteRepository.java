package it.epicode.gestioneDispositivi.repositories;


	import java.awt.print.Pageable;

import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import it.epicode.gestioneDispositivi.entities.Dipendente;

	public interface DipendenteRepository extends JpaRepository <Dipendente,Long>{

		static Page findAll(Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}
}
