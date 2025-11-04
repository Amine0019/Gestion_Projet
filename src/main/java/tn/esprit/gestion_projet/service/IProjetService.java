package tn.esprit.gestion_projet.service;

import tn.esprit.gestion_projet.entities.Projet;

import java.util.List;

public interface IProjetService {
    Projet addOrUpdate(Projet projet);
    void deleteProjetById(long id);
    List<Projet> findAllProjets();
    Projet findProjet(long id);
    Projet assignProjetDetailToProjet(long idProjet,long idProjetD);
}
