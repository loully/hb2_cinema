
import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../model/User';
import { Observable } from 'rxjs';



@Injectable({
  providedIn: 'root'
})
export class Userservice {
  user: User;
  private userUrl: string;
  constructor(private http: HttpClient) {
    this.userUrl = 'http://localhost:8080/REST/utilisateur';
  }




  public findAll(): Observable<User[]> {
    return this.http.get<User[]>(this.userUrl);
  }



  public save(user: User) {

    return this.http.post<User>(this.userUrl, user);

  }
}
