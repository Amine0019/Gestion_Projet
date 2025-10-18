package tn.esprit.gestion_projet.service;

import tn.esprit.gestion_projet.entities.Entreprise;

import java.util.List;

public interface IEntrepriseService {
    Entreprise addOrUpdateEntreprise(Entreprise entreprise);
    void deleteEntreprise(long id);
    List<Entreprise> findAllEntreprise();
    Entreprise findEntrepriseById(long id);
}
