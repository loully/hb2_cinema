package fr.hb2.cinemaproject.cinemaapplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import fr.hb2.cinemaproject.cinemaapplication.entities.Films;


@SpringBootApplication
public class CinemaprojectApplication implements CommandLineRunner{
	

	
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(CinemaprojectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(Films.class);
		
		
	
}
}
