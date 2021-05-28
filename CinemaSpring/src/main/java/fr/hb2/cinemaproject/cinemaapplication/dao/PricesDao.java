package fr.hb2.cinemaproject.cinemaapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import fr.hb2.cinemaproject.cinemaapplication.entities.Prices;

@RepositoryRestResource
@CrossOrigin("*")
public interface PricesDao extends JpaRepository<Prices, Long> {

}