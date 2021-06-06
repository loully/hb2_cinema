import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-bookingrecapitulative',
  templateUrl: './bookingrecapitulative.component.html',
  styleUrls: ['./bookingrecapitulative.component.css']
})
export class BookingrecapitulativeComponent implements OnInit {

  @Input() dataSession;
  @Input() isNotFinished;
  @Output() newBooleanEvent = new EventEmitter<boolean>();

  constructor() { }

  ngOnInit(): void {
  }


  OnClickModify(){
    // this.dataSession = {};
    this.isNotFinished =! this.isNotFinished;
    this.changeBoolean(this.isNotFinished);
    
  }
  
  changeBoolean(value: boolean) {
    this.newBooleanEvent.emit(value);
  }
}
