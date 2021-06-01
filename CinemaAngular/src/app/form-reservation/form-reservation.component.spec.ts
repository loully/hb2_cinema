import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormReservationComponent } from './form-reservation.component';

describe('FormReservationComponent', () => {
  let component: FormReservationComponent;
  let fixture: ComponentFixture<FormReservationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormReservationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormReservationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
