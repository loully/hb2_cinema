import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Session } from '../shared/models/sessions.models';

@Injectable({
  providedIn: 'root'
})
export class SessionService {

  private sessionUrl:string;

  constructor(private http:HttpClient) { 
    this.sessionUrl = 'http://localhost:8080/REST/session';
  }

  public findAll():Observable<Session[]>{
    return this.http.get<Session[]>(this.sessionUrl);
  }
}
