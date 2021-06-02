package fr.hb2.cinemaproject.cinemaapplication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.hb2.cinemaproject.cinemaapplication.dao.PricesDao;
import fr.hb2.cinemaproject.cinemaapplication.entities.Prices;

@Service
public class PriceServiceImpl implements PriceService {
	
	@Autowired
	PricesDao priceDAO;

	@Override
	public Prices getById(Long id) {
		return priceDAO.findById(id).orElse(null);
	}
	
	@Override
	public List<Prices> getAll(){
		return priceDAO.findAll();
	}
	
}
