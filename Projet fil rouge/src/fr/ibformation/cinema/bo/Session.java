package fr.ibformation.cinema.bo;

public class Session {
	private Film film;
	private Room room;
	
	// Constructeur
	public Session (Film film, Room room) {
		this.film = film;
		this.room = room;
	}
	
	// Méthode d'affichage
	public String description() {
		return "Prochaine séance : " + this.film.getTitleFilm() + ", salle " + this.room.getRoomNumber();
	}
	
	
    // Getters Setters
	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
}

