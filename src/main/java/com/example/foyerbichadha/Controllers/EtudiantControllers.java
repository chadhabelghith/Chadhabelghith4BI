package com.example.foyerbichadha.Controllers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.foyerbichadha.entities.Etudiant;
import com.example.foyerbichadha.Service.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor


public class EtudiantControllers {
    IEtudiantService etudiantService;
    @PostMapping("/addEtudiant")
    Etudiant addEtudiant(@RequestBody Etudiant e){
        return etudiantService.addEtudiant(e);
    }
    @DeleteMapping("/remove-Etudiant/{idEtudiant}")
    public void removeEtudiant(@PathVariable("idEtudiant") Long Eid) {
        etudiantService.deleteEtudiant(Eid);
    }
    @PutMapping("/modify-Etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant e) {
        Etudiant Etudiant = etudiantService.UpdateEtudiant(e);
        return Etudiant;
    }
    @GetMapping("/retrieve-all-Etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.getAllEtudiant();
        return listEtudiants;
    }
}
