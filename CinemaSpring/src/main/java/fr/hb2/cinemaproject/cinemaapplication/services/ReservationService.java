package fr.hb2.cinemaproject.cinemaapplication.services;

import java.util.List;

import fr.hb2.cinemaproject.cinemaapplication.entities.Reservations;

public interface ReservationService {
	public void create (Reservations reservation);
	public List<Reservations> getAll();

}
