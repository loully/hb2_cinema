import { Component, OnInit } from '@angular/core';

import { NgbCarouselConfig } from '@ng-bootstrap/ng-bootstrap';
import { FilmserviceService } from "../service/filmservice.service";
import { Films } from '../model/Films';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  films: Films[] = [];

  constructor(private filmService: FilmserviceService) { }



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

  images = [700, 533, 807, 124].map((n) => `https://picsum.photos/id/${n}/900/500`);




}
