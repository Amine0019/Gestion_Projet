package tn.esprit.gestion_projet.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestion_projet.entities.Entreprise;
import tn.esprit.gestion_projet.repositories.EntrepriseRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class EntrepriseServiceImplement implements IEntrepriseService{
    final EntrepriseRepository entrepriseRepository;
    @Override
    public Entreprise addOrUpdateEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public void deleteEntreprise(long id) {
        entrepriseRepository.deleteById(id);
    }

    @Override
    public List<Entreprise> findAllEntreprise() {
        return entrepriseRepository.findAll();
    }

    @Override
    public Entreprise findEntrepriseById(long id) {
        return entrepriseRepository.findById(id).get();
    }
}
