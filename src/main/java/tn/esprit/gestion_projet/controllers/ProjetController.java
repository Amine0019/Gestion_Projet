package tn.esprit.gestion_projet.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestion_projet.entities.Projet;
import tn.esprit.gestion_projet.service.IProjetService;

import java.util.List;

@RestController
@RequestMapping("/projetController")
@AllArgsConstructor
public class ProjetController {
    final IProjetService projetService;
    @PostMapping("/addProjet")
    public Projet addProjet(@RequestBody Projet projet) {
        return projetService.addOrUpdate(projet);
    }

    @PutMapping("/updateProjet")
    public Projet updateProjet(@RequestBody Projet projet) {
        return projetService.addOrUpdate(projet);
    }

    @DeleteMapping("/deleteProjet")
    void deleteProjet(@RequestBody long idProjet) {
        projetService.deleteProjetById(idProjet);
    }

    @GetMapping("/findAllProjet")
    List<Projet> findAllProjet() {
        return projetService.findAllProjets();
    }

    @GetMapping("/findProjet")
    Projet findProjetById(@RequestParam long idProjet) {
        return projetService.findProjet(idProjet);
    }

    @PutMapping("/assignProjetDetailToProjet/{idProjet}/{idProjetD}")
    public Projet assignProjetDetailToProjet(@PathVariable long idProjet, @PathVariable long idProjetD) {
        return projetService.assignProjetDetailToProjet(idProjet, idProjetD);
    }

}
