package fr.hb2.cinemaproject.cinemaapplication.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import fr.hb2.cinemaproject.cinemaapplication.enums.SensoryExperience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")

public class Rooms implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int roomNumber;
	private int numberOfSeats;
	private SensoryExperience sensoryExperience;
	 @OneToOne(mappedBy = "rooms")
	    private Sessions sessions;
	 
	 
	 /**
	  * Constructor without id 
	  * @param roomNumber
	  * @param numberOfSeats
	  * @param sensoryExperience
	  */
	public Rooms(int roomNumber, int numberOfSeats, SensoryExperience sensoryExperience) {
		super();
		this.roomNumber = roomNumber;
		this.numberOfSeats = numberOfSeats;
		this.sensoryExperience = sensoryExperience;
	}
	 
	
	
	
}
