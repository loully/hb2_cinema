package fr.hb2.cinemaproject.cinemaapplication.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.hb2.cinemaproject.cinemaapplication.dao.RoomsDao;
import fr.hb2.cinemaproject.cinemaapplication.entities.Rooms;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	RoomsDao roomDAO;
	
	@Override
	@Transactional
	public void create(Rooms room) {
		roomDAO.save(room);
	}
	
	@Override
	@Transactional
	public void deleteById(Long id) {
		roomDAO.deleteById(id);
	}
	
	@Override
	@Transactional
	public void update(Rooms room) {
		roomDAO.save(room);
	}
	
	@Override
	public Rooms getById(Long id) {
		return roomDAO.findById(id).orElse(null);
	}
	
	@Override
	public List<Rooms> getAll(){
		return roomDAO.findAll();
	}
	

}
