package fr.hb2.cinemaproject.cinemaapplication.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
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
	private LocalTime duration;
	private LocalDate releaseDate;
	private String description;
	private String urlPoster;
	 
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

	public Films(Long idFilm, String title, String languageFilm, LocalTime duration, LocalDate releaseDate,
			String description, String urlPoster, Set<Categories> categories) {
		super();
		this.idFilm = idFilm;
		this.title = title;
		this.languageFilm = languageFilm;
		this.duration = duration;
		this.releaseDate = releaseDate;
		this.description = description;
		this.urlPoster = urlPoster;
		this.categories = categories;
	}

	//Add a team member to Film
	public void addTeamMembers(TeamMembers teamMember) {
		teamMembers.add(teamMember);
		
		//Manage double dependancies
		//Set<Films> films = new HashSet<Films>();
		//films.add(this);
		//teamMember.setFilms(films);
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
