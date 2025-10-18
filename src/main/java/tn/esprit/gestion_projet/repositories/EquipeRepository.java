package tn.esprit.gestion_projet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.gestion_projet.entities.Equipe;
@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
