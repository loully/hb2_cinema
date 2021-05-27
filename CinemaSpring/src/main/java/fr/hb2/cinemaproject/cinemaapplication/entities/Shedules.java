package fr.hb2.cinemaproject.cinemaapplication.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Shedules {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.TIME)
	private Date day_date;
	@Temporal(TemporalType.TIME)
	private Date start_time;
	@Temporal(TemporalType.TIME)
	private Date end_time;
	@OneToMany(mappedBy = "shedules")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Collection<Sessions> sessions;
}
