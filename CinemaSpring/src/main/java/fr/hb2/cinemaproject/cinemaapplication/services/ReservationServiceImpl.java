package fr.hb2.cinemaproject.cinemaapplication.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.hb2.cinemaproject.cinemaapplication.dao.ReservationsDao;
import fr.hb2.cinemaproject.cinemaapplication.entities.Reservations;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	ReservationsDao reservationDAO;
	
	@Override
	@Transactional
	public void create(Reservations reservation) {
		reservationDAO.save(reservation);
	}
	
	@Override
	public List<Reservations> getAll(){
		return reservationDAO.findAll();
	}

}
