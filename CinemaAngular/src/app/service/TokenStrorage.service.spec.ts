/* tslint:disable:no-unused-variable */

import { TestBed, inject } from '@angular/core/testing';
import { TokenStorageService } from './TokenStrorage.service';

describe('Service: TokenStrorage', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [TokenStorageService]
    });
  });

  it('should ...', inject([TokenStorageService], (service: TokenStorageService) => {
    expect(service).toBeTruthy();
  }));
});
