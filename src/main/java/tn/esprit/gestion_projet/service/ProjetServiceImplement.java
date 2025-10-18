package tn.esprit.gestion_projet.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestion_projet.entities.Projet;
import tn.esprit.gestion_projet.repositories.ProjetRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ProjetServiceImplement implements IProjetService{
    final ProjetRepository projetRepository;
    @Override
    public Projet addOrUpdate(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public void deleteProjetById(long id) {
        projetRepository.deleteById(id);
    }

    @Override
    public List<Projet> findAllProjets() {
        return projetRepository.findAll();
    }

    @Override
    public Projet findProjet(long id) {
        return projetRepository.findById(id).get();
    }
}
