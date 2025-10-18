package tn.esprit.gestion_projet.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestion_projet.entities.Equipe;
import tn.esprit.gestion_projet.repositories.EquipeRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class EquipeServiceImplement implements IEquipeService{
    final EquipeRepository equipeRepository;
    @Override
    public Equipe addOrUpdateEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public void deleteEquipe(long id) {
        equipeRepository.deleteById(id);
    }

    @Override
    public List<Equipe> findAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe findEquipeById(long id) {
        return equipeRepository.findById(id).get();
    }
}
