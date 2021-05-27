package fr.hb2.cinemaproject.cinemaapplication.services;

import java.util.List;

import fr.hb2.cinemaproject.cinemaapplication.entities.Films;
/**
 * movies management services
 * @author ib
 *
 */
public interface FilmService {
	/***
	 * add a single-movie
	 * @param movie
	 */
	public void create (Films film);

	/**
	 * create  a movie
	 * @param movie
	 */
	public void deleteById (Long id);
	/**
	 * delete a movie
	 * @param movie
	 */
	public void update (Films film);
	/**
	 * update a movies
	 * @param movie
	 */
	public Films getById (Long id);
	/**
	 * retrieving a list of the movies by id
	 * @param movie
	 */
	public List<Films> getAll();
	/**
	 * retrieving a list of all movies
	 * @param movie
	 */

}
