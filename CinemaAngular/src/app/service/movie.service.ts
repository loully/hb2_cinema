import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class MovieService {

  constructor(private http: HttpClient) { }

  getMovieBySearchTerm(query) {
    return this.http.get(`https://www.omdbapi.com/?apikey=d3f6c0ee&s=query`);
  }

}
