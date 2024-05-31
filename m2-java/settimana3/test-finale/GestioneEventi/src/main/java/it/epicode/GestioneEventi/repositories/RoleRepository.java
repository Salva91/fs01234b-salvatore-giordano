package it.epicode.GestioneEventi.repositories;

import it.epicode.GestioneEventi.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

