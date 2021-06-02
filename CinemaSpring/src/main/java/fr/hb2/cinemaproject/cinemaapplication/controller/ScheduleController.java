package fr.hb2.cinemaproject.cinemaapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.hb2.cinemaproject.cinemaapplication.entities.Schedules;
import fr.hb2.cinemaproject.cinemaapplication.services.ScheduleService;

@CrossOrigin(origins = "*")
@RestController
public class ScheduleController {
	@Autowired
	private ScheduleService scheduleService;
	
	@GetMapping("/REST/schedule/{id}")
	public Schedules getById(@PathVariable("id") Long id) {
		return scheduleService.getById(id);
	}
	
	@GetMapping("/REST/schedule")
	public List<Schedules> getAll() {
		return scheduleService.getAll();
	}

}
