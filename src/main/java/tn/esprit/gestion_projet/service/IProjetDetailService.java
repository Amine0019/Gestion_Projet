package tn.esprit.gestion_projet.service;

import tn.esprit.gestion_projet.entities.ProjetDetail;

import java.util.List;

public interface IProjetDetailService {
    ProjetDetail addOrUpdateProjet(ProjetDetail projetDetail);
    void deleteProjetDetailById(long id);
    List<ProjetDetail> findAllProjetsDetail();
    ProjetDetail findProjetDetailById(long id);
}
