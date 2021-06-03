package fr.hb2.cinemaproject.cinemaapplication.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	private LocalTime duration;
	private LocalDate releaseDate;
	private String description;
	private String urlPoster;
	 
	@ManyToOne
	private Categories categorie;
//	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
//	    @JoinTable(
//	            name = "categoriesFilm",
//	            joinColumns = {@JoinColumn(name = "idFilm")},
//	            inverseJoinColumns = {@JoinColumn(name = "idCategories")}
//	    )
//	    private Set<Categories> categories = new HashSet<>();
	
	@OneToMany(mappedBy="film")
    private List<TeamMembers> teamMembers = new ArrayList<>();
	
	@OneToOne(mappedBy = "film")
	private Sessions sessions;
	
	public Films(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}

	public Films(Long idFilm, String title, String languageFilm, LocalTime duration, LocalDate releaseDate,
			String description, String urlPoster, Categories categorie) {
		super();
		this.idFilm = idFilm;
		this.title = title;
		this.languageFilm = languageFilm;
		this.duration = duration;
		this.releaseDate = releaseDate;
		this.description = description;
		this.urlPoster = urlPoster;
		this.categorie = categorie;
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
