import { Component, OnInit } from '@angular/core';
import { Session } from '../shared/models/sessions.models';
import { FilmserviceService } from "../service/filmservice.service";
import { Films } from '../model/Films';
@Component({
  selector: 'app-liste',
  templateUrl: './liste.component.html',
  styleUrls: ['./liste.component.css']
})
export class ListeComponent implements OnInit {
  films: Films[] = [];
  constructor(private filmService: FilmserviceService) { }


  listSessions: Session[] = [
    //Film id:1 : Soul
    new Session(1, 1, new Date(2021, 5, 24, 10, 20, 0)),
    new Session(1, 1, new Date(2021, 5, 24, 14, 0, 0)),
    new Session(1, 2, new Date(2021, 5, 24, 16, 0, 0)),
    // Film id:2 : Toy Story 4
    new Session(2, 2, new Date(2021, 5, 24, 10, 20, 0)),
    new Session(2, 2, new Date(2021, 5, 24, 14, 0, 0)),
    new Session(2, 1, new Date(2021, 5, 24, 16, 0, 0)),
    // Film id:2 : En avant
    new Session(3, 3, new Date(2021, 5, 24, 10, 20, 0)),
    new Session(3, 3, new Date(2021, 5, 24, 14, 0, 0)),
    new Session(3, 3, new Date(2021, 5, 24, 16, 0, 0)),
  ];
  reloadData() {

    this.filmService.findAll().subscribe(
      data => {
        this.films = data;

      }
    );
  }
  ngOnInit() {
    this.reloadData();
  }
  deletefilm(idk: number) {

    this.filmService.delete(idk).subscribe();
    console.log('index', idk)
  }

}
