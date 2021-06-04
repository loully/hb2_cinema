import { Categories } from "./Catégories";

import { Reservation } from "./Reservation";
import { TeamMembers } from "./TeamMembers";

enum Gender {
  homme = 'homme',
  femme = 'femme',
  autre = 'autre'
}

export class Users {

  constructor(public id?: number,
    public lastName?: string,
    public firstName?: string,
    public mail?: string,

    public dateOfBirth?: Date,
    public adress?: string,
    public gender?: Gender,
    public password?: string,

    public reservations?: Reservation[],
    public teamMembers?: TeamMembers[]
  ) { }
}
