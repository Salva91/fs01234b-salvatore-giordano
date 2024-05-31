package it.epicode.GestioneEventi.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Entity
@Table(name = "roles")
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
public class Role extends BaseEntity {
    private String name;
}

