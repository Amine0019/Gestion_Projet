package tn.esprit.gestion_projet.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestion_projet.entities.Entreprise;
import tn.esprit.gestion_projet.service.IEntrepriseService;

import java.util.List;

@RestController
@RequestMapping("/entrepriseController")
@AllArgsConstructor
public class EntrepriseController {
    final IEntrepriseService entrepriseService;
    @PostMapping("/addEntreprise")
    Entreprise addEntreprise(@RequestBody Entreprise entreprise) {
        return entrepriseService.addOrUpdateEntreprise(entreprise);
    }

    @PutMapping("/updateEntreprise")
    Entreprise updateEntreprise(@RequestBody Entreprise entreprise) {
        return entrepriseService.addOrUpdateEntreprise(entreprise);
    }

    @DeleteMapping("/deleteEntreprise")
    void deleteEntreprise(@RequestParam long idEntreprise) {
        entrepriseService.deleteEntreprise(idEntreprise);
    }

    @GetMapping("/findAllEntreprise")
    List<Entreprise> findAllEntreprise() {
        return entrepriseService.findAllEntreprise();
    }

    @GetMapping("/findEntreprise")
    Entreprise findEntrepriseById(@RequestParam long idEntreprise) {
        return entrepriseService.findEntrepriseById(idEntreprise);
    }
}
