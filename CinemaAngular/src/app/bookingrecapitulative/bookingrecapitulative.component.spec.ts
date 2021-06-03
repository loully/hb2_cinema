import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookingrecapitulativeComponent } from './bookingrecapitulative.component';

describe('BookingrecapitulativeComponent', () => {
  let component: BookingrecapitulativeComponent;
  let fixture: ComponentFixture<BookingrecapitulativeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BookingrecapitulativeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BookingrecapitulativeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
