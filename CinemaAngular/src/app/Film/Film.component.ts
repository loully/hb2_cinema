import { Component, OnInit } from '@angular/core';

import { FilmserviceService } from "../service/filmservice.service";
import { Film } from '../model/Film';
@Component({
  selector: 'app-Film',
  templateUrl: './Film.component.html',
  styleUrls: ['./Film.component.css']
})
export class FilmComponent implements OnInit {
  films: Film[] = [];
  constructor(private filmService: FilmserviceService) { }


  ngOnInit() {
    this.reloadData();
  }

  reloadData() {

    this.filmService.findAll().subscribe(
      data => {
        this.films = data;

      }
    );
  }

  callSave() {
    const film = new Film();
    film.title = 'toto';
    this.filmService.save(film).subscribe(
      data => {
        console.log(data);

      }
    );
  }

  callDelete(){
    this.filmService.remove(2).subscribe(
      data => {
        console.log(data);
        console.log('On a supprimé un film !');
      }


    )
  }

  callUpdate(){
    const film = new Film();
    film.duration = 90;
    film.idFilm = 1;
    this.filmService.update(film).subscribe(
      data => {
        console.log("Update a film with id  = "+ film.idFilm);
      }
    )
  }




}
