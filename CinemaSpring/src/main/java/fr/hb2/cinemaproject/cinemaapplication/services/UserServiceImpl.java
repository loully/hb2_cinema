package fr.hb2.cinemaproject.cinemaapplication.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.hb2.cinemaproject.cinemaapplication.dao.UsersDao;
import fr.hb2.cinemaproject.cinemaapplication.entities.Users;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UsersDao userDAO;
	
	@Override
	@Transactional
	public void create(Users user) {
		userDAO.save(user);
	}
	
	@Override
	@Transactional
	public void deleteById(Long id) {
		userDAO.deleteById(id);
	}
	
	@Override
	@Transactional
	public void update(Users user) {
		userDAO.save(user);
	}
	
	@Override
	public Users getById(Long id) {
		return userDAO.findById(id).orElse(null);
	}
	
	@Override
	public List<Users> getAll(){
		return userDAO.findAll();
	}
	

}
