import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Sessions } from '../model/sessions.models';

@Injectable({
  providedIn: 'root'
})
export class SessionService {

  private sessionUrl:string;

  constructor(private http:HttpClient) { 
    this.sessionUrl = 'http://localhost:8080/REST/session';
  }

  public findAll():Observable<Sessions[]>{
    return this.http.get<Sessions[]>(this.sessionUrl);
  }

  public findByFilmId(idFilm: number):Observable<Sessions[]>{
    return this.http.get<Sessions[]>(this.sessionUrl  + '/film/' + idFilm);
  }
}
