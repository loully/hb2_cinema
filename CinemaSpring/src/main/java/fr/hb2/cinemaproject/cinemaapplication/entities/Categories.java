package fr.hb2.cinemaproject.cinemaapplication.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import fr.hb2.cinemaproject.cinemaapplication.enums.Categorie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Categorie designation;

	/*@ManyToMany
	@JoinTable(name = "CategoriesFilm", joinColumns = @JoinColumn(name = "idCategories"), inverseJoinColumns = @JoinColumn(name = "idFilm"))
	private List<Films> films = new ArrayList<>();*/
	
	 @ManyToMany(mappedBy = "categories", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	    private Set<Films> Films = new HashSet<>();

}
