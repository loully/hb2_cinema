
import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Users } from '../model/Users';
import { Observable } from 'rxjs';




@Injectable({
  providedIn: 'root'
})
export class Userservice {
  users: Users;
  private usersUrl: string;
  private usersUrld: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/REST/utilisateur';
    this.usersUrld = 'http://localhost:8080/REST/utilisateur/';
  }




  public findAll(): Observable<Users[]> {
    return this.http.get<Users[]>(this.usersUrl);
  }

  getAll() {
    return this.http.get<Users[]>(`${this.usersUrl}`);
  }

  public save(users: Users) {

    return this.http.post<Users>(this.usersUrl, users);

  }
  public delete(id: number) {
    let paramid = id;
    return this.http.delete<Users>(this.usersUrld + id);
  }
}
