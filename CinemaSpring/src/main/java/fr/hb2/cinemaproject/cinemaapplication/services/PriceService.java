package fr.hb2.cinemaproject.cinemaapplication.services;

import java.util.List;

import fr.hb2.cinemaproject.cinemaapplication.entities.Prices;

public interface PriceService {
	public Prices getById (Long id);
	public List<Prices> getAll();
}
