import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Films } from '../model/Films';
import { Observable } from 'rxjs';



@Injectable({
  providedIn: 'root'
})
export class FilmserviceService {
  private filmUrl: string;
  private filmUrlde: string;


  constructor(private http: HttpClient) {
    this.filmUrl = 'http://localhost:8080/REST/film';
    this.filmUrlde = 'http://localhost:8080/REST/film/';
  }




  public findAll(): Observable<Films[]> {
    return this.http.get<Films[]>(this.filmUrl);
  }

  public save(film: Films) {
    return this.http.post<Films>(this.filmUrl, film);
  }
  public delete(id: number) {
    let paramid = id;
    return this.http.delete<Films>(this.filmUrlde + id);
  }

  public getIdByTitle(titleFilm: string): Observable<number> {
    return this.http.get<number>(this.filmUrl + '/search/' + titleFilm);
  }

  // public getByTitle(titleFilm: string): Observable<Films> {
  //   let id:Observable<number>;
  //   id = this.getIdByTitle(titleFilm);
  //   console.log(" SERVICE : "+)
  //   return this.http.get<Films>(this.filmUrlde + id);
  // }

  public getById(id:number): Observable<Films> {
    return this.http.get<Films>(this.filmUrl + '/' + id);
  }

}

