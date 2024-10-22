package com.example.foyerbichadha.Controllers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.foyerbichadha.entities.Universite;
import com.example.foyerbichadha.Service.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universite")
@AllArgsConstructor

public class UniversiteControllers {
    IUniversiteService universiteService;
    @PostMapping("/addUniversite")
    Universite addUniversite(@RequestBody Universite u){
        return universiteService.addUniversite(u);
    }
    @DeleteMapping("/remove-Universite/{idUniversite}")
    public void removeUniversite(@PathVariable("idUniversite") Long Uid) {
        universiteService.deleteUniversite(Uid);
    }
    @PutMapping("/modify-Universite")
    public Universite modifyUniversite(@RequestBody Universite u) {
        Universite Universite = universiteService.UpdateUniversite(u);
        return Universite;
    }
    @GetMapping("/retrieve-all-Universites")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universiteService.getAllUniversite();
        return listUniversites;
    }
}
