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
}
