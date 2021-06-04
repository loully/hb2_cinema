import { Films } from "src/app/model/Films";

export class Sessions {

    public id: number = 0;
    public films: Films[] = [];
    public schedules: any[] = [];

    constructor(public filmId: number, public roomId: number, public scheduleId: Date) {
        this.filmId = filmId;
        this.roomId = roomId;
        this.scheduleId = scheduleId;
    }
}
