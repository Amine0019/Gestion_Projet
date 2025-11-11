package tn.esprit.gestion_projet.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.gestion_projet.entities.Equipe;
import tn.esprit.gestion_projet.entities.Projet;
import tn.esprit.gestion_projet.entities.ProjetDetail;
import tn.esprit.gestion_projet.repositories.EquipeRepository;
import tn.esprit.gestion_projet.repositories.ProjetDetailRepository;
import tn.esprit.gestion_projet.repositories.ProjetRepository;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
@AllArgsConstructor
@Slf4j
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
    @Scheduled(fixedDelay = 10,timeUnit = TimeUnit.SECONDS,initialDelay = 5)
    //@Scheduled(fixedRate = 10000)
    //@Scheduled(cron = "10 * * * * *")
    public List<Projet> findAllProjets() {
        List<Projet> projets = projetRepository.findAll();
        for (Projet projet : projets) {
            log.info("le projet :"+ projet);
        }
        return projets;
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
