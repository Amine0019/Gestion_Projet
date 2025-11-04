package tn.esprit.gestion_projet.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestion_projet.entities.Equipe;
import tn.esprit.gestion_projet.entities.Projet;
import tn.esprit.gestion_projet.entities.ProjetDetail;
import tn.esprit.gestion_projet.repositories.EquipeRepository;
import tn.esprit.gestion_projet.repositories.ProjetDetailRepository;
import tn.esprit.gestion_projet.repositories.ProjetRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ProjetServiceImplement implements IProjetService{
    final ProjetRepository projetRepository;
    final ProjetDetailRepository projetDetailRepository;
    final EquipeRepository equipeRepository;
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

    @Override
    public Projet assignProjetDetailToProjet(long idProjet, long idProjetD) {
        Projet projet = projetRepository.findById(idProjet).get();
        ProjetDetail projetD = projetDetailRepository.findById(idProjetD).get();
        projet.setProjetD(projetD);
        return projetRepository.save(projet);
    }

    @Override
    public Equipe assignProjetToEquipe(long idEquipe, long idProjet) {
        Projet projet = projetRepository.findById(idProjet).get();
        Equipe equipe = equipeRepository.findById(idEquipe).get();
        equipe.getProjets().add(projet);
        return equipeRepository.save(equipe);
    }

    @Override
    public Projet addProjetAndAssignProjetDetail(Projet p, long idProjetD) {
        ProjetDetail projetD = projetDetailRepository.findById(idProjetD).get();
        p.setProjetD(projetD);
        return projetRepository.save(p);
    }
}
