package fr.hb2.cinemaproject.cinemaapplication.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Prices {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// @OneToMany(mappedBy="prices")
	// @JsonProperty(access=Access.WRITE_ONLY)
	// private Collection<Reservations> reservations;
	private int value;
	@JsonIgnore
	@OneToMany(targetEntity = Reservations.class, mappedBy = "prices")
	private List<Reservations> teamMembers = new ArrayList<>();
	public Prices(Long id, int value) {
		super();
		this.id = id;
		this.value = value;
	}

	
}
