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

import fr.hb2.cinemaproject.cinemaapplication.entities.Users;
import fr.hb2.cinemaproject.cinemaapplication.enums.Gender;
import fr.hb2.cinemaproject.cinemaapplication.services.UserService;
@CrossOrigin(origins = "*")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostConstruct
	@Transactional
	public void init() {
		Users a = new Users("Richard", "Boris", "br@orange.fr", null, "inconnu", Gender.homme, "IlovePancakes" );
		Users b = new Users("Wickers","Joanna","jsteDu52@orange.fr", null, "inconnu", Gender.femme, "Zombiegirl" );

		userService.create(a);
		userService.create(b);
	}
	
	@DeleteMapping("/REST/utilisateur/{id}")
	public void deleteUser (@PathVariable("id") Long id) {
		userService.deleteById(id);
	}
	
	@PutMapping("/REST/utilisateur")
	public Users updateUser (@RequestBody Users user) {
		userService.update(user);
		return user;
	}
	@PostMapping("/REST/utilisateur")
	public Users createUser (@RequestBody Users user) {
		userService.create(user);
		return user;
	}
	@GetMapping("/REST/utilisateur/{id}")
	public Users getById(@PathVariable("id") Long id) {
		return userService.getById(id);
	}
	
	
	@GetMapping("/REST/utilisateur")
	public List<Users> getAll() {
		return userService.getAll();
	}
	
	@GetMapping("/api/auth/signin")
	public List<Users> getAllauth() {
		return userService.getAllauth();
	}
	@PostMapping("/api/auth/signin")
	public Users createUserauth (@RequestBody Users user) {
		userService.create(user);
		return user;
		
	}
	@PostMapping("/api/auth/signup")
	public Users createUserauthup (@RequestBody Users user) {
		userService.create(user);
		return user;
		
	}

}
