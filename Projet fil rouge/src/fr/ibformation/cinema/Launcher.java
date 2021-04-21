package fr.ibformation.cinema;

import fr.ibformation.cinema.bo.Film;
import fr.ibformation.cinema.bo.Room;
import fr.ibformation.cinema.bo.Session;

public class Launcher {

	public static void main(String[] args) {
		Session firstSession = new Session(new Film("Fast et Furious", "Film qui déchire", "fr", 1989), new Room(5, 120, 1));
		System.out.println(firstSession.description());
	}
}
