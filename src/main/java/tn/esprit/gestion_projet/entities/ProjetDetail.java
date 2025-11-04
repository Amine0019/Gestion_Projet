package tn.esprit.gestion_projet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjetDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idProjetDetail;
    String nomProjet;
    String technologie;
    long cout;
    Date DateDebut;

    @OneToOne(mappedBy = "projetD")
    @ToString.Exclude
            @JsonIgnore
    Projet projet;

}
