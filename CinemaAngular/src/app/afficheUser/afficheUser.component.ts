import { Component, OnInit } from '@angular/core';
import { Users } from '../model/Users';
import { Userservice } from '../service/userservice';

@Component({
  selector: 'app-afficheUser',
  templateUrl: './afficheUser.component.html',
  styleUrls: ['./afficheUser.component.css']
})
export class AfficheUserComponent implements OnInit {
  users: Users[] = [];
  constructor(private userService: Userservice) { }

  reloadData() {

    this.userService.findAll().subscribe(
      data => {
        this.users = data;

      }
    );
  }
  ngOnInit() {
    this.reloadData();
  }
  deleteuser(idk: number) {

    this.userService.delete(idk).subscribe();
    console.log('index', idk)
  }
  logout() {

    window.location.reload();
  }
}


