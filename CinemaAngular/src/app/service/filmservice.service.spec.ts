import { TestBed } from '@angular/core/testing';

import { FilmserviceService } from './filmservice.service';

describe('FilmserviceService', () => {
  let service: FilmserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FilmserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
