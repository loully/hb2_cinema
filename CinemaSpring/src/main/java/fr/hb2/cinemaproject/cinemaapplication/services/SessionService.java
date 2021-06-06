package fr.hb2.cinemaproject.cinemaapplication.services;

import java.util.List;
import java.util.Optional;

import fr.hb2.cinemaproject.cinemaapplication.entities.Films;
import fr.hb2.cinemaproject.cinemaapplication.entities.Sessions;

public interface SessionService {

	/**
	 * Create a session
	 * @param session
	 */
	public void create (Sessions session);
	
	/**
	 * Get all sessions
	 * @return
	 */
	public List<Sessions> getAll();

	/**
	 * Get a session by its id
	 * @param id
	 * @return
	 */
	public Sessions getById(Long id);
	
	public List<Sessions> getByFilm (Long id);
}
