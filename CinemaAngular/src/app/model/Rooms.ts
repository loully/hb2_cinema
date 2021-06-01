import { Sessions } from "./sessions.models";


enum SensoryExperience {
        normal = 'normal',
        three_dimensions = 'three_dimensions',
        four_dimensions= 'four_dimensions'
      }

export class Rooms{

    constructor(public id?: number,
                public numberOfSeats?: number,
                public roomNumber?: number,
                public sensoryExperience?: SensoryExperience,
                public sessions?: Sessions
        ){}
}