import { Component, OnInit } from '@angular/core';
import { FilmserviceService } from "../service/filmservice.service";
import { Films } from '../model/Films';
import { Sessions } from '../model/sessions.models';

@Component({
  selector: 'app-liste',
  templateUrl: './liste.component.html',
  styleUrls: ['./liste.component.css']
})
export class ListeComponent implements OnInit {
  films: Films[] = [];
  constructor(private filmService: FilmserviceService) { }


  listSessions:Sessions[] = [
    //Film id:1 : Soul
    //new Sessions(),

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
