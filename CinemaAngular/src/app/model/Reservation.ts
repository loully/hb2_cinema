export class Reservation{

    constructor(public id: number,
                public hourOfReservation: Date,
                public reference: string,
                public takenSeat: number,
                public priceId: number,
                public sessionId: number,
                public userId: number,
        ){}
}