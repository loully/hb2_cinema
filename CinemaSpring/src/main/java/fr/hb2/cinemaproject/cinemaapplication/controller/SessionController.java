package fr.hb2.cinemaproject.cinemaapplication.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.hb2.cinemaproject.cinemaapplication.entities.Films;
import fr.hb2.cinemaproject.cinemaapplication.entities.Rooms;
import fr.hb2.cinemaproject.cinemaapplication.entities.Sessions;
import fr.hb2.cinemaproject.cinemaapplication.entities.Shedules;
import fr.hb2.cinemaproject.cinemaapplication.services.SessionService;

@CrossOrigin(origins = "*")
@RestController
public class SessionController {
	
	@Autowired
	private SessionService sessionService;
	
	@PostConstruct
	@Transactional
	public void init() {
		Films film1 = new Films("Toy Story 4", "Woody a toujours privilégié la joie de ses jeunes propriétaires - Andy puis Bonnie - et de ses compagnons, n'hésitant pas à prendre tous les risques pour eux, aussi inconsidérés soient-ils.");
		Rooms room1 = new Rooms(1,125,null);
		/*Shedules schedule1 = new Shedules(Date.valueOf(LocalDate.now()),Date.valueOf(LocalDate.now()),Date.valueOf(LocalDate.now()));
		Sessions session1 = new Sessions(room1,schedule1,film1)
		System.out.println("-----Controller -------");
		System.out.println("Session créé : "+session1);
		sessionService.create(session1);*/
	}
	
	@GetMapping("/REST/session/{id}")
	public Sessions getById(@PathVariable("id") Long id) {
		return sessionService.getById(id);
	}
	
	
	@GetMapping("/REST/session")
	public List<Sessions> getAll() {
		return sessionService.getAll();
	}
	
	@GetMapping("/REST/session/film/{id}")
	public List<Sessions> getByFilm(@PathVariable("id") Long id) {
		return sessionService.getByFilm(id);
	}
	
}
