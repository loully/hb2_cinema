import { Component, OnInit } from '@angular/core';

import { FilmserviceService } from "../service/filmservice.service";
import { Films } from '../model/Films';
@Component({
  selector: 'app-Film',
  templateUrl: './Film.component.html',
  styleUrls: ['./Film.component.css']
})
export class FilmComponent implements OnInit {

  films: Films[] = [];

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
    const film = new Films();
    film.title = 'toto';

    this.filmService.save(film).subscribe(
      data => {
        console.log(data);

      }
    );
  }
}
