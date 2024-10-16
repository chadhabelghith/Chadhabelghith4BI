package com.example.foyerbichadha.Service;

import com.example.foyerbichadha.entities.chambre;
import com.example.foyerbichadha.entities.Reservation;

import java.util.List;

public interface IReservationService {
    chambre addReservation(Reservation reservation);
    void deleteReservation(String idReservation);
    Reservation UpdateReservation (Reservation reservation);
    List<Reservation> getAllReservation(Reservation reservation);
}
