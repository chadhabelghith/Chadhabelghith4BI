package com.example.foyerbichadha.Service;

import com.example.foyerbichadha.entities.chambre;
import com.example.foyerbichadha.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);
    void deleteEtudiant(Long idEtudiant);
    Etudiant UpdateEtudiant (Etudiant etudiant);
    List<Etudiant> getAllEtudiant(Etudiant etudiant);
}