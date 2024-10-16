package com.example.foyerbichadha.Service;

import com.example.foyerbichadha.entities.chambre;
import com.example.foyerbichadha.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);
    void deleteFoyer(Long idFoyer);
    chambre UpdateFoyer (Foyer foyer);
    List<Foyer> getAllFoyer(Foyer foyer);
}
