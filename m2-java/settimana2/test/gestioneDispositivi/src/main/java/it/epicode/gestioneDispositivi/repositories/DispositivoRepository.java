package it.epicode.gestioneDispositivi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.epicode.gestioneDispositivi.entities.Dispositivo;

public interface DispositivoRepository extends JpaRepository <Dispositivo,Long>{

}
