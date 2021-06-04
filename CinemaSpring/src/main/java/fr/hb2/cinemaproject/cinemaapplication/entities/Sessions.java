package fr.hb2.cinemaproject.cinemaapplication.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

	@JsonIgnore
	@OneToMany(mappedBy = "sessions")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Collection<Reservations> reservations;

	
	@ManyToOne
    @JoinColumn(name = "rooms_id", referencedColumnName = "id")
	private Rooms rooms;
	
	@ManyToOne
    @JoinColumn(name = "shedules_id", referencedColumnName = "id")
	private Shedules shedules;
	
	@ManyToOne
    @JoinColumn(name = "films_id", referencedColumnName = "id")
	private Films film;

	public Sessions(Long id, Rooms rooms, Shedules shedules, Films film) {
		super();
		this.id = id;
		this.rooms = rooms;
		this.shedules = shedules;
		this.film = film;
	}
	
	
	

}
