export class Session {

    public id:number=0;

    constructor(public filmId:number,public roomId:number,public scheduleId:Date){
        this.filmId = filmId;
        this.roomId=roomId;
        this.scheduleId = scheduleId;
    }
}