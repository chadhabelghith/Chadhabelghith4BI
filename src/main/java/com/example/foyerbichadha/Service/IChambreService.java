package com.example.foyerbichadha.Service;

import com.example.foyerbichadha.entities.chambre;

import java.util.List;

public interface IChambreService {
    chambre addChambre(chambre c);
    void deleteChambre(Long id);
    chambre updateChambre(chambre c);
    List<chambre> getAllChambres();
    chambre retrieveChambre(Long id);
}

