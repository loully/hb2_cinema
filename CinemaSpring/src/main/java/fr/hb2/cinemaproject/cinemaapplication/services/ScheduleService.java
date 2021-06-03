package fr.hb2.cinemaproject.cinemaapplication.services;

import java.util.List;


import fr.hb2.cinemaproject.cinemaapplication.entities.Shedules;


public interface ScheduleService {
	public Shedules getById (Long id);
	public List<Shedules> getAll();

}
