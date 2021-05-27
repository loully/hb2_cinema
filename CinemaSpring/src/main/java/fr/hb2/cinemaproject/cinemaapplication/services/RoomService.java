package fr.hb2.cinemaproject.cinemaapplication.services;

import java.util.List;

import fr.hb2.cinemaproject.cinemaapplication.entities.Rooms;

public interface RoomService {
	public void create (Rooms room);
	public void deleteById (Long id);
	public void update (Rooms room);
	public Rooms getById (Long id);
	public List<Rooms> getAll();

}
