import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Shedules } from '../model/Shedules';

@Injectable({
  providedIn: 'root'
})
export class ScheduleService {

  private scheduleUrl:string;

  constructor(private http:HttpClient) {
    this.scheduleUrl = 'http://localhost:8080/REST/schedule';
  }

  public findAll():Observable<Shedules[]>{
    return this.http.get<Shedules[]>(this.scheduleUrl);
  }
}
