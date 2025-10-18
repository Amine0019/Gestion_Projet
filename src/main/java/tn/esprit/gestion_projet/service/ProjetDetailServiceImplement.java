package tn.esprit.gestion_projet.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestion_projet.entities.ProjetDetail;
import tn.esprit.gestion_projet.repositories.ProjetDetailRepository;
import tn.esprit.gestion_projet.repositories.ProjetRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ProjetDetailServiceImplement implements IProjetDetailService {
    final ProjetDetailRepository projetDetailRepository;
    @Override
    public ProjetDetail addOrUpdateProjet(ProjetDetail projetDetail) {
        return projetDetailRepository.save(projetDetail);
    }

    @Override
    public void deleteProjetDetailById(long id) {
        projetDetailRepository.deleteById(id);
    }

    @Override
    public List<ProjetDetail> findAllProjetsDetail() {
        return projetDetailRepository.findAll();
    }

    @Override
    public ProjetDetail findProjetDetailById(long id) {
        return projetDetailRepository.findById(id).get();
    }


}
