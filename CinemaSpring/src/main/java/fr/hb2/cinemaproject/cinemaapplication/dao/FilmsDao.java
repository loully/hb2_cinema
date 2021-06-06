
package fr.hb2.cinemaproject.cinemaapplication.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.hb2.cinemaproject.cinemaapplication.entities.Films;

@RepositoryRestResource
@CrossOrigin("*")
public interface FilmsDao extends JpaRepository<Films, Long> {

	public Films findByTitle(String title);

}
