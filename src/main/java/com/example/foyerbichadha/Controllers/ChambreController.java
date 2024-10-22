package com.example.foyerbichadha.Controllers;


import com.example.foyerbichadha.Service.IChambreService;
import com.example.foyerbichadha.entities.chambre;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {
    private final IChambreService IChambreService;

    @PostMapping("/addchambre")
    public chambre addChambre(@RequestBody chambre c) {
        return IChambreService.addChambre(c);
    }

    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        IChambreService.deleteChambre(chId);
    }

    @PutMapping("/modify-chambre")
    public chambre modifyChambre(@RequestBody chambre c) {
        return IChambreService.updateChambre(c);
    }
    @Operation(description = "recuperer toutes les chambres de la base de donnes")
    @GetMapping("/retrieve-all-chambres")
    public List<chambre> getChambres() {
        return IChambreService.getAllChambres();
    }

    @GetMapping("/retrieve-chambre/{chambre-id}")
    public chambre retrieveChambre(@PathVariable("chambre-id") Long idChambre) {
        return IChambreService.retrieveChambre(idChambre);
    }
}
