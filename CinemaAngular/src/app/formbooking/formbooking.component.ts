import { Component, OnInit } from '@angular/core';
import { SessionService } from '../service/session.service';
import { Sessions } from '../model/sessions.models';
import { FilmserviceService } from '../service/filmservice.service';
import { Films } from '../model/Films';
import { Shedules} from '../model/Shedules';
import { ScheduleService } from '../service/schedule.service';


@Component({
  selector: 'app-formbooking',
  templateUrl: './formbooking.component.html',
  styleUrls: ['./formbooking.component.css']
})
export class FormbookingComponent implements OnInit {

  films:Films[] = [];
  schedules: Shedules[] = [];
  sessions:Sessions[] = [];
  allsessions:Sessions;

  

  //Input variables
  firstName;
  lastName;
  mail;
  film;
  rooms;
  sessionItem;
  numberSeats;
  price;
  dataSession;
  booking:any = {};
  item;
  id;
  // Value received by the form
  sess:Sessions;
//Variable to show or hide recapitulatif
  isNotFinished:boolean=true;



  constructor(private filmService: FilmserviceService, private scheduleService: ScheduleService, private sessionService: SessionService) {
  
   }

  ngOnInit(): void {

    this.reloadData();
    //this.reloadDataSchedules();


  }

  

  

  reloadData(){
    this.filmService.findAll().subscribe(
      data => {
        this.films = data;
        console.log("Liste des films : ", data);
        //this.reloadDataSchedules();
      }
    );
    
    
  }
  


  onClick(){
    console.log("session selected",typeof this.allsessions);
    this.booking.firstName = this.firstName;
    this.booking.lastName = this.lastName;
    this.booking.mail = this.mail;
    this.booking.film = this.film;
    this.booking.sessionItem = this.allsessions;
    console.log(" ONCLICK : object session registred",this.booking.sessionItem);
    this.booking.rooms = this.rooms;
    this.booking.numberSeats = this.numberSeats;
    this.booking.price = this.numberSeats * 5;

    //Display or not the recapitulatif child-component
    this.isNotFinished = false;
    console.log(this.booking);

    //Push infos into variable dataSession send to child-component
    this.dataSession = this.booking;
  }

  checkSelected(){
    this.filmService.getIdByTitle(this.film).subscribe(
      data => {
        this.id = data;
        console.log("Contenu de data : ", data);
        this.findByFilmId(this.id);
      }
    )
    
   
  }

  findByFilmId(id:number){
    this.sessionService.findByFilmId(id).subscribe(
      data => {
        this.sessions = data;
        console.log("Liste des sessions liées au film : ", data );
      }
    );
  }

  callbackChild(isNotFinished:boolean){
    this.isNotFinished = isNotFinished;
  }

}
