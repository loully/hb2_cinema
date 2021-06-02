package fr.hb2.cinemaproject.cinemaapplication.services;

import java.util.List;

import fr.hb2.cinemaproject.cinemaapplication.entities.Schedules;


public interface ScheduleService {
	public Schedules getById (Long id);
	public List<Schedules> getAll();

}
