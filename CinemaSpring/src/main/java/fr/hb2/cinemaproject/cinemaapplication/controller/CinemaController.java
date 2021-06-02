package fr.hb2.cinemaproject.cinemaapplication.controller;

	import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;

import fr.hb2.cinemaproject.cinemaapplication.entities.Categories;
import fr.hb2.cinemaproject.cinemaapplication.entities.Films;


	@RestController
	public class CinemaController {
		@GetMapping("/hello")
		public String bonjour() {
			return "Bonjour";
	}
		  public static void main(String[] args) throws Exception {
		        EntityManagerFactory entityManagerFactory = null;
		        EntityManager entityManager = null;
		        
		        try {
		            
		            entityManagerFactory = Persistence.createEntityManagerFactory("WebStore");
		            entityManager = entityManagerFactory.createEntityManager();
		        
		            Films films = entityManager.find( Films.class, 1 );            
		            System.out.println( "categorie associés à film" );
					
					  for( Categories associatedRole : films.getCategories() ) {
					  System.out.println( associatedRole ); 
					  }
					 

		            Categories categories = entityManager.find( Categories.class, 1 );            
		            System.out.println( "film possédant le categorie client" );
		            for( Films associatedUser : categories.getFilms() ) {
		                System.out.println( associatedUser );
		            }

		        } finally {
		            if ( entityManager != null ) entityManager.close();
		            if ( entityManagerFactory != null ) entityManagerFactory.close();
		        }

		    }
	}


