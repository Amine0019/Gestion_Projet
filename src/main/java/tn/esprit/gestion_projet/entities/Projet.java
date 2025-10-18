package tn.esprit.gestion_projet.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idProjet;
    String Sujet;

    @OneToOne
    ProjetDetail projetD;

    @ManyToMany(mappedBy = "projets")
    Set<Equipe> equipes;

}
