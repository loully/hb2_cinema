package fr.hb2.cinemaproject.cinemaapplication.services;

import java.util.List;

import fr.hb2.cinemaproject.cinemaapplication.entities.Users;
/**
 * Users management 
 * @author ib
 *
 */
public interface UserService {
	/***
	 * add a single-User
	 * @param User
	 */
	public void create (Users user);
	/**
	 * create  a User
	 * @param User
	 */
	public void deleteById (Long id);
	/**
	 * delete a User
	 * @param User
	 */
	public void update (Users user);
	/**
	 * update a User
	 * @param User
	 */
	public Users getById (Long id);
	/**
	 * retrieving a list of the User by id
	 * @param User
	 */
	public List<Users> getAll();
	/**
	 * retrieving a list of all Users
	 * @param User
	 */

}
