package fr.hb2.cinemaproject.cinemaapplication.entities;

import java.time.LocalDate;
import java.time.LocalTime;
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
public class Schedules {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDate day_date;
	private LocalTime start_time;
	private LocalTime end_time;
	@OneToMany(mappedBy = "shedules")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Collection<Sessions> sessions;
	
	/**
	 * Constructor without id and Collection of Sessions
	 * @param day_date
	 * @param start_time
	 * @param end_time
	 */
	public Schedules(LocalDate day_date, LocalTime start_time, LocalTime end_time) {
		super();
		this.day_date = day_date;
		this.start_time = start_time;
		this.end_time = end_time;
	}
	
	
}
