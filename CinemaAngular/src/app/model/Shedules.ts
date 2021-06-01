import { Sessions } from "./sessions.models";

export class Shedules{

    constructor(public id: number,
                public dayDate: Date,
                public endTime: Date,
                public sessions: Sessions[]
        ){}
}
