package fr.hb2.cinemaproject.cinemaapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.hb2.cinemaproject.cinemaapplication.entities.Films;
import fr.hb2.cinemaproject.cinemaapplication.entities.Prices;
import fr.hb2.cinemaproject.cinemaapplication.services.PriceService;

@CrossOrigin(origins = "*")
@RestController
public class PriceController {
	
	@Autowired
	private PriceService priceService;
	
	@GetMapping("/REST/price/{id}")
	public Prices getById(@PathVariable("id") Long id) {
		return priceService.getById(id);
	}
	
	@GetMapping("/REST/price")
	public List<Prices> getAll() {
		return priceService.getAll();
	}
	
	@PostMapping("/REST/price")
	public Prices createPrice (@RequestBody Prices price) {
		priceService.create(price);
		return price;
	}
	

}
