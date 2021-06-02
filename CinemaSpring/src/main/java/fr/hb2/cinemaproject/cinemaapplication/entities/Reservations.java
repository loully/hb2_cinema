package fr.hb2.cinemaproject.cinemaapplication.entities;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reservations implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long takenSeats;
	private LocalDate hourOfReservation;
	private String reference;
	@ManyToOne
	private Sessions sessions;	
	@ManyToOne
	private Prices prices;	
	@ManyToOne
	private Users users;	
}
