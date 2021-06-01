package fr.hb2.cinemaproject.cinemaapplication.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import fr.hb2.cinemaproject.cinemaapplication.entities.Rooms;
import fr.hb2.cinemaproject.cinemaapplication.enums.SensoryExperience;
import fr.hb2.cinemaproject.cinemaapplication.services.RoomService;

@CrossOrigin(origins = "*")
@RestController
public class RoomController {
	
	@Autowired
	private RoomService roomService;
	
	
	@DeleteMapping("/REST/room/{id}")
	public void deleteRoom (@PathVariable("id") Long id) {
		roomService.deleteById(id);
	}
	
	@PutMapping("/REST/room")
	public Rooms updateRoom (@RequestBody Rooms room) {
		roomService.update(room);
		return room;
	}
	@PostMapping("/REST/room")
	public Rooms createRoom (@RequestBody Rooms room) {
		roomService.create(room);
		return room;
	}
	@GetMapping("/REST/room/{id}")
	public Rooms getById(@PathVariable("id") Long id) {
		return roomService.getById(id);
	}
	
	@GetMapping("/REST/room")
	public List<Rooms> getAll() {
		return roomService.getAll();
	}


}
