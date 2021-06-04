import { Films } from "./Films";

enum Gender {
        homme = 'homme',
        femme = 'femme',
        autre = 'autre'
}

enum RoleMember {
        acteur = 'acteur',
        réalisateur = 'réalisateur'
}

export class TeamMembers {

        constructor(public id: number,
                public lastName: string,
                public firstName: string,
                public gender: Gender,
                public nationality: string,
                public dateOfBirth: Date,
                public roleMember: RoleMember,

                public films: Films[]
        ) { }
}
