import { Component, OnInit } from '@angular/core';
import { SessionService } from '../service/session.service';
import { Session } from '../shared/models/sessions.models';

@Component({
  selector: 'app-formbooking',
  templateUrl: './formbooking.component.html',
  styleUrls: ['./formbooking.component.css']
})
export class FormbookingComponent implements OnInit {

  sessions:Session[] = [];

  constructor(private sessionService: SessionService) { }

  ngOnInit(): void {
    this.sessionService.findAll().subscribe(
      data => {
        this.sessions = data;
      }
    )
  }

}
