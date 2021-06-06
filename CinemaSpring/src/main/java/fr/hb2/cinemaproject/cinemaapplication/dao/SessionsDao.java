package fr.hb2.cinemaproject.cinemaapplication.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.hb2.cinemaproject.cinemaapplication.entities.Films;
import fr.hb2.cinemaproject.cinemaapplication.entities.Sessions;
import fr.hb2.cinemaproject.cinemaapplication.entities.Shedules;

@RepositoryRestResource
@CrossOrigin("*")
public interface SessionsDao extends JpaRepository<Sessions, Long> {

	public List<Sessions> findByFilm(Films film);

	public Sessions findByFilmAndShedules(Films film, Shedules shedule);


}
