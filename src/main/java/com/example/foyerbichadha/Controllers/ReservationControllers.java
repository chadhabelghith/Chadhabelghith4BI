package com.example.foyerbichadha.Controllers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.foyerbichadha.entities.Reservation;
import com.example.foyerbichadha.Service.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@AllArgsConstructor

public class ReservationControllers {
    IReservationService reservationService;
    @PostMapping("/addReservation")
    Reservation addReservation(@RequestBody Reservation r ){
        return reservationService.addReservation(r);
    }
    @DeleteMapping("/remove-Foyer/{idReservation}")
    public void removeReservation(@PathVariable("idReservation") String RId) {
        reservationService.deleteReservation(RId);
    }
    @PutMapping("/modify-Reservation")
    public Reservation modifyReservation(@RequestBody Reservation r) {
        Reservation reservation = reservationService.UpdateReservation(r);
        return r;
    }
    @GetMapping("/retrieve-all-Reservation")
    public List<Reservation> getReservations() {
        List<Reservation> listReservation = reservationService.getAllReservation();
        return listReservation;
    }
}
