package tn.esprit.gestion_projet.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEquipe;
    String nom;
    @Enumerated(EnumType.STRING)
    Domain domain ;


    @ManyToMany
    Set<Projet> projets;

    @ManyToOne
    Entreprise entreprise;

}
