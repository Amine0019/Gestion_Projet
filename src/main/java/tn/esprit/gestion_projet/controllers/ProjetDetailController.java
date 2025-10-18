package tn.esprit.gestion_projet.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestion_projet.entities.ProjetDetail;
import tn.esprit.gestion_projet.service.IProjetDetailService;

import java.util.List;

@RestController
@RequestMapping("/projetDetailController")
@AllArgsConstructor
public class ProjetDetailController {
    final IProjetDetailService projetDetailService;
    @PostMapping("/addProjetDetail")
    ProjetDetail addProjetDetail(@RequestBody ProjetDetail projetDetail) {
        return projetDetailService.addOrUpdateProjet(projetDetail);
    }

    @PutMapping("/updateProjetDetail")
    ProjetDetail updateProjetDetail(@RequestBody ProjetDetail projetDetail) {
        return projetDetailService.addOrUpdateProjet(projetDetail);
    }

    @DeleteMapping("/deleteProjetDetail")
    void deleteProjetDetail(@RequestParam long idProjetDetail) {
        projetDetailService.deleteProjetDetailById(idProjetDetail);
    }

    @GetMapping("/findAllProjetDetail")
    List<ProjetDetail> findAllProjetDetail() {
        return projetDetailService.findAllProjetsDetail();
    }

    @GetMapping("/findProjetDetail")
    ProjetDetail findProjetDetailById(@RequestParam long id) {
        return projetDetailService.findProjetDetailById(id);
    }
}
