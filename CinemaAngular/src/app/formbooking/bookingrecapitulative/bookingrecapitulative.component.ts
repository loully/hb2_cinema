import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';

import { Prices } from 'src/app/model/Prices';
import { Users } from 'src/app/model/Users';
import { Sessions } from 'src/app/model/sessions.models';
import { SessionService } from 'src/app/service/session.service';
import { ReservationService } from 'src/app/service/reservation.service';
import { Reservation } from 'src/app/model/Reservation';
import { Films } from 'src/app/model/Films';
import { Rooms } from 'src/app/model/Rooms';
import { Shedules } from 'src/app/model/Shedules';
import { FilmserviceService } from 'src/app/service/filmservice.service';
import { Observable, Subject } from 'rxjs';
import { DatePipe } from '@angular/common';
import { VariablesGlobales } from 'src/app/variablesglobales';

@Component({
  selector: 'app-bookingrecapitulative',
  templateUrl: './bookingrecapitulative.component.html',
  styleUrls: ['./bookingrecapitulative.component.css'],
  providers: [DatePipe]
})
export class BookingrecapitulativeComponent implements OnInit {

  @Input() dataSession;
  @Input() isNotFinished;
  @Output() newBooleanEvent = new EventEmitter<boolean>();

  // Needed variables
  user: Users;
  price: Prices = new Prices();
  priceValue : number;
  session: Sessions = new Sessions();
  film:Films = new Films();
  reservation: Reservation = new Reservation();
  timeReservation:string;
  //Date
  today:Date;

  //Couter for id
  counter:number = 0;
  
  constructor(private reservationService: ReservationService, 
    private filmService:FilmserviceService,
    private datePipe:DatePipe) { 
    this.timeReservation = this.datePipe.transform(this.timeReservation,'yyyy-MM-dd');
  }
  ngOnInit(): void {
    this.today = new Date();
    console.log("today",this.today);
  }
  
  
  OnClickModify(){
    // this.dataSession = {};
    this.isNotFinished =! this.isNotFinished;
    this.changeBoolean(this.isNotFinished);
    
  }
  
  changeBoolean(value: boolean) {
    this.newBooleanEvent.emit(value);
  }
  
  OnClickValidate(){
    console.log("Afficher la session :", typeof this.dataSession.film);
    let title = this.dataSession.film;
    let price = this.dataSession.price;
    //console.log("FilmObjetObservable",this.getIdByTitle(title));
    this.getIdByTitle(title);
    console.log("-----OnCLICKVALIDATE----")
    
  }
  
  
  getIdByTitle(title: string){
    // let subject = new Subject<number>();
    this.filmService.getIdByTitle(title).subscribe(
      data => {
        let filmObject;
        console.log("-------function : GET IB DY TITLE-----");
        console.log("l'id du  film", data);
        filmObject = this.getById(data);
        // this.session.film = filmObject;
        //subject.next(data)
      }
      );
      //return filmObject;
      //return subject.asObservable();
    }
    getById(id:number){
      // let subject = new Subject<Films>();
      this.filmService.getById(id).subscribe(
        data => {
          
          //Get the film
          console.log("---------function : GET BY ID--------");
          console.log("Objet film", data);
          this.film = data;
          this.session.id = this.counter;
          this.session.film = this.film;
          console.log("Objet session", this.session);
          console.log("Objet session.film", this.film);
          this.reservation.session = this.session;
          
          //Add id on Reservation and session
          this.counter++;
          this.reservation.id = this.counter;

          //Get the date
          this.reservation.hourOfReservation = this.today;
          
          // Get the price
          this.priceValue = this.dataSession.price;
          this.price.value = this.priceValue;
          this.reservation.price = this.price;
          console.log("Objet reservation.price",  this.reservation.price);
          console.log("Objet reservation.session",  this.reservation.session);
          
          //Get the numberofseats
          this.reservation.takenSeats = this.dataSession.numberSeats;
          console.log("Objet reservation.takenSeats",  this.dataSession.numberSeats);
          
          //Save the resrvation
          this.saveReservation();
          //subject.next(data)
        }
        );
        //return subject.asObservable();
      }

      saveReservation(){ 
        console.log("réservation",this.reservation);
        this.reservationService.save(this.reservation).subscribe(
          data => {
            console.log("La réservation : ", data);
          }
          )
        }
    }
    