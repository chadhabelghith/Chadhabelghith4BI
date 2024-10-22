package com.example.foyerbichadha.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.foyerbichadha.entities.Bloc;
import com.example.foyerbichadha.Service.IBlocService;

import java.util.List;

@RestController
@RequestMapping("/bloc")
@AllArgsConstructor

public class BlocControllers {
    IBlocService IBlocService;
    @PostMapping("/addBloc")
    Bloc addBloc(@RequestBody Bloc b){
        return IBlocService.addBloc(b);
    }
    @DeleteMapping("/remove-bloc/{idBloc}")
    public void removeBloc(@PathVariable("idBloc") Long BlocId) {
        IBlocService.deleteBloc(BlocId);
    }
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc b) {
        Bloc bloc = IBlocService.updateBloc(b);
        return bloc;
    }
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listBloc = IBlocService.getAllBloc();
        return listBloc;
    }
}
