import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Userservice } from '../service/userservice';
import { FilmserviceService } from "../service/filmservice.service";
import { Films } from '../model/Films';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  films: Films[] = [];
  content: string;
  readAPI(URL: string): Observable<any> {
    return this.http.get<any>(URL);
  }
  constructor(private http: HttpClient, private filmService: FilmserviceService, private userService: Userservice) { }



  reloadData() {

    this.filmService.findAll().subscribe(
      data => {
        this.films = data;

      }
    );
  }
  ngOnInit() {
    this.reloadData();
    this.userService.getPublicContent().subscribe(
      data => {
        this.content = data;
      },
      err => {
        this.content = JSON.parse(err.error).message;
      }
    );
  }

  images = [700, 533, 807, 124].map((n) => `https://picsum.photos/id/${n}/900/500`);

  searchMovie() {
    console.log('recherche du film ', encodeURIComponent(this.searchTitle).trim());
    const search = encodeURIComponent(this.searchTitle).trim();
    this.movieApiUrl = 'http://localhost:8080/REST/utilisateur' + search;
    this.readAPI(this.movieApiUrl)
      .subscribe((data) => {
        console.log('recheche movie ', data);
        this.movieData = data.Search;
      });
  }
  movieApiUrl = '';
  searchTitle = '';
  movieData = {
    title: '',
    description: '',
    imageUrl: ''
  };




}
