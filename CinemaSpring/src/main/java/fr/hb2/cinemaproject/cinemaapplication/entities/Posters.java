package fr.hb2.cinemaproject.cinemaapplication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Posters {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	  @OneToOne(mappedBy = "posters")
	    private Films films;
}
