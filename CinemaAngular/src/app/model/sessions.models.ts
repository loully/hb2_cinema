import { Films } from "src/app/model/Films";
import { Rooms } from "src/app/model/Rooms";
import { Shedules } from "src/app/model/Shedules";

export class Sessions {

    constructor(public film:Films,public rooms:Rooms,public shedules:Shedules){
        this.film = film;
        this.rooms = rooms;
        this.shedules = shedules;
    }
}
