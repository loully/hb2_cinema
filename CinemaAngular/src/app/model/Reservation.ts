import { Prices } from "./Prices";
import { Sessions } from "./sessions.models";
import { Users } from "./Users";

export class Reservation{

    constructor(public id?: number,
                public hourOfReservation?: Date,
                public reference?: string,
                public takenSeats?: number,
                public price?: Prices,
                public session?: Sessions,
                public user?: Users,
        ){}
}