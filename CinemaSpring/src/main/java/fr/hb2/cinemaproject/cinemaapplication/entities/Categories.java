package fr.hb2.cinemaproject.cinemaapplication.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import fr.hb2.cinemaproject.cinemaapplication.enums.Categorie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Categories {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private Categorie designation;
	
	@JsonIgnore
	@OneToMany(targetEntity = Films.class, mappedBy = "categorie")
	private List<Films> films;

	public Categories(int id, Categorie designation) {

		this.id = id;
		this.designation = designation;
	}
//     @ManyToMany(mappedBy = "categories", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
//        private List<Films> Films = new ArrayList<>();

}