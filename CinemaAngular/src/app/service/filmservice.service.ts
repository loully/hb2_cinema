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
}

