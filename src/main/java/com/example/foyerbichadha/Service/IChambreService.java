package com.example.foyerbichadha.Service;

import com.example.foyerbichadha.entities.chambre;

import java.util.List;

public interface IChambreService {
    chambre addChambre(chambre chambre);
    void deleteChambre(Long idChambre);
    chambre updateChambre(chambre chambre);
    List<chambre> getAllChambres();
}
