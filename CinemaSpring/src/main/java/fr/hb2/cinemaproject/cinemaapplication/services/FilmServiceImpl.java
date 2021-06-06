package fr.hb2.cinemaproject.cinemaapplication.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.hb2.cinemaproject.cinemaapplication.dao.FilmsDao;
import fr.hb2.cinemaproject.cinemaapplication.entities.Films;

@Service
public class FilmServiceImpl implements FilmService {
	
	
	@Autowired
	FilmsDao filmDAO;
	
	@Override
	@Transactional
	public void create(Films film) {
		filmDAO.save(film);
	}
	
	@Override
	@Transactional
	public void deleteById(Long id) {
		filmDAO.deleteById(id);
	}
	
	@Override
	@Transactional
	public void update(Films film) {
		filmDAO.save(film);
	}
	
	@Override
	public Films getById(Long id) {
		return filmDAO.findById(id).orElse(null);
	}
	
	@Override
	public List<Films> getAll(){
		return filmDAO.findAll();
	}

	@Override
	public Long getIdByTitle(String title) {
		Films film = (Films) filmDAO.findByTitle(title);
		Long idFilm = film.getIdFilm();
		return idFilm;
	}
	
	

}
