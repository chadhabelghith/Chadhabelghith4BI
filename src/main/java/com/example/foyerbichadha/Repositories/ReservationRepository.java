package com.example.foyerbichadha.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.foyerbichadha.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}

