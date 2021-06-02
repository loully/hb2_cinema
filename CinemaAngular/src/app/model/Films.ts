import { Categories } from "./Catégories";
import { Posters } from "./Posters";
import { TeamMembers } from "./TeamMembers";

export class Films {





  constructor(public id?: number,
    public title?: string,
    public languageFilms?: string,
    public duration?: number,
    public releaseDate?: Date,
    public description?: string,
    public poster?: Posters,

    public categories?: Categories[],
    public teamMembers?: TeamMembers[]
  ) { }


}
