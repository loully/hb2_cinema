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

	@Temporal(TemporalType.TIMESTAMP)
	private Date day_date;
	@Temporal(TemporalType.TIMESTAMP)
	private Date start_time;
	@Temporal(TemporalType.TIMESTAMP)
	private Date end_time;
	@OneToMany(mappedBy = "shedules")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Collection<Sessions> sessions;
	
	/**
	 * Constructor without id and Collection of Sessions
	 * @param day_date
	 * @param start_time
	 * @param end_time
	 */
	public Shedules(Date day_date, Date start_time, Date end_time) {
		super();
		this.day_date = day_date;
		this.start_time = start_time;
		this.end_time = end_time;
	}
	
	
}
