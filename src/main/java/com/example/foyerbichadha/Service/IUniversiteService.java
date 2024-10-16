package com.example.foyerbichadha.Service;

import com.example.foyerbichadha.entities.chambre;
import com.example.foyerbichadha.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    void deleteUniversite(Long idUniversite);
    Universite UpdateUniversite (Universite universite);
    List<Universite> getAllUniversite(Universite universite);
}
