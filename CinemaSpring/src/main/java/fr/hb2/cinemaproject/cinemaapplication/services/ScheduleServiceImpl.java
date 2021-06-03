package fr.hb2.cinemaproject.cinemaapplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import fr.hb2.cinemaproject.cinemaapplication.dao.ShedulesDao;
import fr.hb2.cinemaproject.cinemaapplication.entities.Shedules;


@Service
public class ScheduleServiceImpl implements ScheduleService{
	
	@Autowired
	ShedulesDao scheduleDAO;
	
	@Override
	public Shedules getById(Long id) {
		return scheduleDAO.findById(id).orElse(null);
	}
	
	@Override
	public List<Shedules> getAll(){
		return scheduleDAO.findAll();
	}

}
