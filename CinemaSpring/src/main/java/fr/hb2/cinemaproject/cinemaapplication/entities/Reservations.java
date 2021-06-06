package fr.hb2.cinemaproject.cinemaapplication.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long takenSeats;
	private LocalDate hourOfReservation;
	private String reference;
	@ManyToOne
	@JoinColumn
	private Sessions sessions;	
	@ManyToOne
	@JoinColumn
	private Prices prices;	
	@ManyToOne
	@JoinColumn
	private Users users;	
}
