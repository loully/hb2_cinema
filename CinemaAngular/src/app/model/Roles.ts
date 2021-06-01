import { Users } from "./Users";

enum Role {
        client = 'client',
	emloyé = 'emloyé',
	administrateur= 'administrateur',
      }

export class Roles {

    constructor(public id: number,
                public role: Role,
                public users: Users[]
        ){}
}

 