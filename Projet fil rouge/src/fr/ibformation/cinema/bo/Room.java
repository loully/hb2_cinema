package fr.ibformation.cinema.bo;

public class Room {
	//Déclaration des variables
	private int roomNumber, sensoryExperience, numberOfSeats;
	
	//Constructeur
	public Room(int roomNumber, int numberOfSeats, int sensoryExperience) {
		this.roomNumber = roomNumber;
		this.numberOfSeats = numberOfSeats;
		this.sensoryExperience = sensoryExperience;
	}

	// Getters et Setters
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getSensoryExperience() {
		return sensoryExperience;
	}

	public void setSensoryExperience(int sensoryExperience) {
		this.sensoryExperience = sensoryExperience;
	}
}
