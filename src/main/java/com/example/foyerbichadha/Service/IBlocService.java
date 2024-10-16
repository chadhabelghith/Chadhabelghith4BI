package com.example.foyerbichadha.Service;

import com.example.foyerbichadha.entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);
    void deleteBloc(Long idBloc);
    Bloc updateBloc(Bloc bloc);
    List<Bloc> getAllBloc();
}
