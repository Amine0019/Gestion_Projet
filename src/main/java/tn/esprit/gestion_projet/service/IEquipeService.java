package tn.esprit.gestion_projet.service;

import tn.esprit.gestion_projet.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    Equipe addOrUpdateEquipe(Equipe equipe);
    void deleteEquipe(long id);
    List<Equipe> findAllEquipes();
    Equipe findEquipeById(long id);

}
