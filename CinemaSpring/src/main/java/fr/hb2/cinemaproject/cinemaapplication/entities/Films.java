package fr.hb2.cinemaproject.cinemaapplication.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
public class Films {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long idFilm;
	private String title;
	private String languageFilm;
	private double duration;
	private Date releaseDate;
	private String description;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "posters_id", referencedColumnName = "id")
	private Posters posters;
	 
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	    @JoinTable(
	            name = "categoriesFilm",
	            joinColumns = {@JoinColumn(name = "idFilm")},
	            inverseJoinColumns = {@JoinColumn(name = "idCategories")}
	    )
	    private Set<Categories> categories = new HashSet<>();
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "filmsTeamMembers",
            joinColumns = {@JoinColumn(name = "idFilm")},
            inverseJoinColumns = {@JoinColumn(name = "idTeamMembers")}
    )
    private Set<TeamMembers> teamMembers = new HashSet<>();

	public Films(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	
	
    
    /*
	@ManyToMany
	@JoinTable(name = "CategoriesFilm", joinColumns = @JoinColumn(name = "idFilm"), inverseJoinColumns = @JoinColumn(name = "idCategories"))
	private List<Categories> categories = new ArrayList<>();
	@ManyToMany
	@JoinTable(name = "FilmsTeamMembers", joinColumns = @JoinColumn(name = "idFilm"), inverseJoinColumns = @JoinColumn(name = "idTeamMembers"))
	private List<TeamMembers> teamMembers = new ArrayList<>();
	
	
*/
	
	
}
