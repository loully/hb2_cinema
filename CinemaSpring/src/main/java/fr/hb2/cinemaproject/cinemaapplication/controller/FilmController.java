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

import fr.hb2.cinemaproject.cinemaapplication.entities.Films;
import fr.hb2.cinemaproject.cinemaapplication.services.FilmService;
@CrossOrigin(origins = "*")
@RestController
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
	@PostConstruct
	@Transactional
	public void init() {
//		Films a = new Films("Là-haut", "Un grand père s'envole dans sa maison avec des ballons.");
//		Films b = new Films("Le monde de Némooooooooo", " Némo est séparé de son père et tente de le retrouver.");
//		Films c = new Films("Là-hautttttt", " sa maison avec des ballons.");
//		
//		filmService.create(a);
//		filmService.create(b);
//		filmService.create(c);
		
		
	}
	
	@DeleteMapping("/REST/film/{id}")
	public void deleteFilm (@PathVariable("id") Long id) {
		filmService.deleteById(id);
	}
	
	@PutMapping("/REST/film")
	public Films updateFilm (@RequestBody Films film) {
		filmService.update(film);
		return film;
	}
	@PostMapping("/REST/film")
	public Films createFilm (@RequestBody Films film) {
		filmService.create(film);
		return film;
	}
	@GetMapping("/REST/film/{id}")
	public Films getById(@PathVariable("id") Long id) {
		return filmService.getById(id);
	}
	
	@GetMapping("/REST/film")
	public List<Films> getAll() {
		return filmService.getAll();
	}

}
