import { Films } from "./Films";

enum Categorie {
        animation = 'animation',
	famille = 'famille',
	fantastique= 'fantastique',
	comédie = 'comédie',
	aventure = 'aventure'
      }

export class Categories{

    constructor(public id: number,
                public designation: Categorie,
                public films: Films[]
        ){}
}
