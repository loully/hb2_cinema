import { Categories } from "./Catégories";

import { TeamMembers } from "./TeamMembers";

export class Films {





  constructor(public id?: number,
    public title?: string,
    public languageFilm?: string,
    public duration?: number,
    public releaseDate?: Date,
    public description?: string,
    public urlPoster?: string,

    public categories?: Categories[],
    public teamMembers?: TeamMembers[]
  ) { }


}
