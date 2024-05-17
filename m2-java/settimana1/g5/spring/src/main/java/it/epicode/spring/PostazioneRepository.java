package it.epicode.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
    List<Postazione> findByTipoAndEdificio_Citta(String tipo, String citta);
}