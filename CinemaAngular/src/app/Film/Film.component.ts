import { Component, OnInit } from '@angular/core';

import { FilmserviceService } from "../service/filmservice.service";
import { Films } from '../model/Films';
import { MovieOpendbi } from '../model/MovieOpendbi';
import { HttpClient } from '@angular/common/http';

import { Observable } from 'rxjs';
@Component({
  selector: 'app-Film',
  templateUrl: './Film.component.html',
  styleUrls: ['./Film.component.css']
})
export class FilmComponent implements OnInit {

  films: Films[] = [];
  movieDataAll: MovieOpendbi[] = [];
  readAPI(URL: string): Observable<any> {
    return this.http.get<any>(URL);
  }
  // constructor(private filmService: FilmserviceService) { }
  constructor(private http: HttpClient, private filmService: FilmserviceService) {

    this.movieApiUrl = 'http://www.omdbapi.com/?apikey=b3fd4fae&s=star%20war';
    this.readAPI(this.movieApiUrl)


      .subscribe((data) => {
        console.log('readapi', data);
        console.log('readapi', data);

        this.movieDataAll = data.Search;


      });
  }
  searchMovie() {
    console.log('recherche du film ', encodeURIComponent(this.searchTitle).trim());
    const search = encodeURIComponent(this.searchTitle).trim();
    this.movieApiUrl = 'http://www.omdbapi.com/?apikey=abe07f5f&s=' + search;
    this.readAPI(this.movieApiUrl)
      .subscribe((data) => {
        console.log('recheche movie ', data);
        this.movieDataAll = data;
      });
  }
  searchTitle = '';
  movieData = {
    title: '',
    description: '',
    imageUrl: ''
  };

  movieApiUrl = '';
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
    //const movieOpendbi = new MovieOpendbi();
    film.title = 'toto';

    this.filmService.save(film).subscribe(
      data => {
        console.log(data);

      }
    );
  }
}
