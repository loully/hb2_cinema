import { Film } from "src/app/model/Film";

export class Session {

    public id:number=0;
    public films:Film[] = [];
    public schedules:any[] = [];

    constructor(public filmId:number,public roomId:number,public scheduleId:Date){
        this.filmId = filmId;
        this.roomId=roomId;
        this.scheduleId = scheduleId;
    }
}