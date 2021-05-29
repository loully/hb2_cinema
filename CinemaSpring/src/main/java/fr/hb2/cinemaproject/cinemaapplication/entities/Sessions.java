package fr.hb2.cinemaproject.cinemaapplication.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sessions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	@OneToMany(mappedBy = "sessions")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Collection<Reservations> reservations;

	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rooms_id", referencedColumnName = "id")
	private Rooms rooms;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shedules_id", referencedColumnName = "id")
	private Shedules shedules;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "films_id", referencedColumnName = "id")
	private Films films;

	public Sessions(Rooms rooms, Shedules shedules, Films films) {
		super();
		this.rooms = rooms;
		this.shedules = shedules;
		this.films = films;
	}
	


}
