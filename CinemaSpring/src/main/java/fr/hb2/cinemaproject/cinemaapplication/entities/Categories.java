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
import javax.persistence.OneToMany;

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
	private int id;

	private Categorie designation;

<<<<<<< HEAD
	//@OneToMany(mappedBy = "categorie")
	//private List<Films> films;
=======
//	@OneToMany(mappedBy = "categorie")
//	private List<Films> films;
>>>>>>> 26f4d3791d5d2226778fb09f078f186372e1b51d

	
//	 @ManyToMany(mappedBy = "categories", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
//	    private List<Films> Films = new ArrayList<>();

<<<<<<< HEAD
/*	public Categories(int id, Categorie designation) {
		super();
		this.id = id;
		this.designation = designation;
	}*/
	 

=======
>>>>>>> 26f4d3791d5d2226778fb09f078f186372e1b51d
}
