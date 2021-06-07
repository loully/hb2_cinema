package fr.hb2.cinemaproject.cinemaapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.hb2.cinemaproject.cinemaapplication.entities.Films;
import fr.hb2.cinemaproject.cinemaapplication.entities.Reservations;
import fr.hb2.cinemaproject.cinemaapplication.services.ReservationService;

@CrossOrigin(origins = "*")
@RestController
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@PostMapping("/REST/reservation")
	public Reservations createReservation (@RequestBody Reservations reservation) {
		reservationService.create(reservation);
		return reservation;
	}
	
	@GetMapping("/REST/reservation")
	public List<Reservations> getAll() {
		return reservationService.getAll();
	}
	

}
