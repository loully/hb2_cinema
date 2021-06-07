import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Reservation } from '../model/Reservation';

@Injectable({
  providedIn: 'root'
})
export class ReservationService {

  private reservationUrl:string;

  constructor(private http:HttpClient) {
    this.reservationUrl = 'http://localhost:8080/REST/reservation';
  }

  public save(reservation: Reservation) {
    return this.http.post<Reservation>(this.reservationUrl, reservation);
  }

  public findAll(): Observable<Reservation[]> {
    return this.http.get<Reservation[]>(this.reservationUrl);
  }
}
