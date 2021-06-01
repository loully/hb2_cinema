import { Component, OnInit } from '@angular/core';
import { Rooms } from '../model/Rooms';
import { RoomService } from '../service/room.service';


@Component({
  selector: 'app-room',
  templateUrl: './room.component.html',
  styleUrls: ['./room.component.css']
})
export class RoomComponent implements OnInit {
  rooms :Rooms[] =[];
  constructor(private roomService: RoomService ) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {

    this.roomService.findAll().subscribe(
      data => {
        this.rooms = data;

      }
    );
  }
  callSave() {
    const room = new Rooms();
    room.id = 3;
    room.roomNumber= 22;
    room.numberOfSeats= 45;

    this.roomService.save(room).subscribe(
      data => {
        console.log(data);

      }
    );
  }

}
