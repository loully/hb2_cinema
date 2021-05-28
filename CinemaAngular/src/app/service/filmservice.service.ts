import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Film } from '../model/Film';
import { Observable } from 'rxjs';



@Injectable({
  providedIn: 'root'
})
export class FilmserviceService {
  private filmUrl: string;
  constructor(private http: HttpClient) {
    this.filmUrl = 'http://localhost:8080/REST/film';
  }




  public findAll(): Observable<Film[]> {
    return this.http.get<Film[]>(this.filmUrl);
  }

  public save(film: Film) {
    return this.http.post<Film>(this.filmUrl, film);
  }

  public remove(id: number) {
    return this.http.delete<Film>(this.filmUrl + '/' + id);
  }

  public update(film:Film){
    return this.http.put<Film>(this.filmUrl, film);
  }
}

