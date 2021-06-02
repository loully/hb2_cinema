package fr.hb2.cinemaproject.cinemaapplication.entities;


import java.sql.Date;
import java.time.LocalDate;
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

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import fr.hb2.cinemaproject.cinemaapplication.enums.Gender;
import fr.hb2.cinemaproject.cinemaapplication.enums.RoleMember;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
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

    @ManyToMany(mappedBy = "teamMembers", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<Films> Films = new HashSet<>();
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

