import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Rooms } from '../model/Rooms';


@Injectable({
  providedIn: 'root'
})
export class RoomService {
  private roomUrl: string;
  constructor(private http: HttpClient) {
    this.roomUrl = 'http://localhost:8080/REST/room';
  }

  public findAll(): Observable<Rooms[]> {
    return this.http.get<Rooms[]>(this.roomUrl);
  }

  public save(room: Rooms) {
    return this.http.post<Rooms>(this.roomUrl, room);
  }

  // public remove(id: number) {
  //   return this.http.delete<Rooms>(this.roomUrl + '/' + id);
  // }

  // public update(room:Rooms){
  //   return this.http.put<Rooms>(this.roomUrl, room);
  // }
}

