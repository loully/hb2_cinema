package fr.hb2.cinemaproject.cinemaapplication.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.hb2.cinemaproject.cinemaapplication.dao.SessionsDao;
import fr.hb2.cinemaproject.cinemaapplication.entities.Films;
import fr.hb2.cinemaproject.cinemaapplication.entities.Sessions;

@Service
public class SessionServiceImpl implements SessionService {

	@Autowired
	SessionsDao sessionDAO;
	@Autowired
	FilmService filmService;
	
	@Transactional
	public void create(Sessions session) {
		sessionDAO.save(session);
	}

	@Override
	public List<Sessions> getAll() {
		return sessionDAO.findAll();
	}

	@Override
	public Sessions getById(Long id) {
		return sessionDAO.findById(id).orElse(null);
	}
	
	@Override
	public List<Sessions> getByFilm (Long id){
		Films film = filmService.getById(id);
		return sessionDAO.findByFilm(film);
		
	}
	
}
