package fr.hb2.cinemaproject.cinemaapplication.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import fr.hb2.cinemaproject.cinemaapplication.enums.Gender;
import fr.hb2.cinemaproject.cinemaapplication.enums.RoleMember;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NamedQueries({
    @NamedQuery(name = "TeamMembers.getByName", query = "select s from TeamMembers s where s.lastName = :lastName and s.firstName = :firstName")})
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class)
public class TeamMembers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastName;
    private String firstName;
    private Gender gender;
    private String nationality;
    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate dateOfBirth;
    private RoleMember roleMember;
   /* @ManyToMany
	@JoinTable(name = "FilmsTeamMembers", joinColumns = @JoinColumn(name = "idTeamMembers"), inverseJoinColumns = @JoinColumn(name = "idFilm"))
	private List<TeamMembers> teamMembers = new ArrayList<>();*/

//    @ManyToMany(mappedBy = "teamMembers", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
//    private Set<Films> Films = new HashSet<>();
    @JsonIgnoreProperties
    @ManyToOne
    @JoinColumn(name="idFilm")
    private Films film; 
    
public TeamMembers(Long id, String lastName, String firstName, Gender gender, String nationality, LocalDate dateOfBirth,
		RoleMember roleMember) {
	super();
	this.id = id;
	this.lastName = lastName;
	this.firstName = firstName;
	this.gender = gender;
	this.nationality = nationality;
	this.dateOfBirth = dateOfBirth;
	this.roleMember = roleMember;
}
 
    
}

