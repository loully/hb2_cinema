import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Userservice } from "../service/userservice";

import { Users } from '../model/Users';

@Injectable({ providedIn: 'root' })
export class AuthenticationService {

  private currentUserSubject: BehaviorSubject<Users>;
  public currentUser: Observable<Users>;
  private usersUrl: string;
  constructor(private http: HttpClient) {

    this.currentUserSubject = new BehaviorSubject<Users>(JSON.parse(localStorage.getItem('currentUser')));
    this.currentUser = this.currentUserSubject.asObservable();
    this.usersUrl = 'http://localhost:8080/REST/utilisateur';
  }

  public get currentUserValue(): Users {
    return this.currentUserSubject.value;
  }

  login(mail: string, password: string) {
    return this.http.post<any>(`${this.usersUrl}`, { mail, password })
      .pipe(map(user => {
        // store user details and jwt token in local storage to keep user logged in between page refreshes
        localStorage.setItem('currentUser', JSON.stringify(user));
        this.currentUserSubject.next(user);
        return user;
      }));
  }

  logout() {
    // remove user from local storage to log user out
    localStorage.removeItem('currentUser');
    this.currentUserSubject.next(null);
  }


}
