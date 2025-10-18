package tn.esprit.gestion_projet.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestion_projet.entities.Equipe;
import tn.esprit.gestion_projet.service.IEquipeService;

import java.util.List;

@RestController
@RequestMapping("/equipeController")
@AllArgsConstructor
public class EquipeController {
    final IEquipeService equipeService;
    @PostMapping("/addEquipe")
    Equipe addEquipe(@RequestBody Equipe equipe) {
        return equipeService.addOrUpdateEquipe(equipe);
    }

    @PutMapping("/updateEquipe")
    Equipe updateEquipe(@RequestBody Equipe equipe) {
        return equipeService.addOrUpdateEquipe(equipe);
    }

    @DeleteMapping("/deleteEquipe")
    void deleteEquipe(@RequestParam long idEquipe) {
        equipeService.deleteEquipe(idEquipe);
    }

    @GetMapping("/findAllEquipe")
    List<Equipe> findAllEquipe() {
        return equipeService.findAllEquipes();
    }

    @GetMapping("/findEquipe")
    Equipe findEquipe(@RequestParam long idEquipe) {
        return equipeService.findEquipeById(idEquipe);
    }
}
