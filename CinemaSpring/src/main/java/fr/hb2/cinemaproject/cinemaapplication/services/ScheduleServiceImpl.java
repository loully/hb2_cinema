package fr.hb2.cinemaproject.cinemaapplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import fr.hb2.cinemaproject.cinemaapplication.dao.SchedulesDao;
import fr.hb2.cinemaproject.cinemaapplication.entities.Schedules;

@Service
public class ScheduleServiceImpl implements ScheduleService{
	
	@Autowired
	SchedulesDao scheduleDAO;
	
	@Override
	public Schedules getById(Long id) {
		return scheduleDAO.findById(id).orElse(null);
	}
	
	@Override
	public List<Schedules> getAll(){
		return scheduleDAO.findAll();
	}

}
