package fr.hb2.cinemaproject.cinemaapplication.entities;


import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import fr.hb2.cinemaproject.cinemaapplication.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastName;
    private String firstName;
    private String mail;
    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate dateOfBirth;
    private String adress;
    private Gender gender;
    private String password;
    @OneToMany(targetEntity=Reservations.class,mappedBy="users")
	@JsonProperty(access=Access.WRITE_ONLY)
	private Collection<Reservations> reservations;
    
    @ManyToOne
    @JoinColumn
    private Roles role;
    
	public Users(String lastName, String firstName, String mail, LocalDate dateOfBirth, String adress, Gender gender,
			String password) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.mail = mail;
		this.dateOfBirth = dateOfBirth;
		this.adress = adress;
		this.gender = gender;
		this.password = password;
	}	
    
    

 
}

