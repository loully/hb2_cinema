import { Component, OnInit } from '@angular/core';
import {
  AbstractControl,
  FormBuilder,
  FormControl,
  FormGroup,
  Validators,
} from '@angular/forms';

// Import the User model
import { Users } from '../model/Users';
import { Userservice } from '../service/userservice';
@Component({
  selector: 'app-signup-form',
  templateUrl: './signup-form.component.html',
  styleUrls: ['./signup-form.component.css'],
})
export class SignupFormComponent {
  constructor(private userservice: Userservice) { }
  title = 'validation des formes angulaires';
  user: Users = new Users();
  dateValidator(c: AbstractControl): { [key: string]: boolean } {
    let value = c.value;
    if (value && typeof value === 'string') {
      let match = value.match(
        /^([12]\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\d|3[01]))/
      );
      if (!match) {
        return { dateInvalid: true };
      } else if (match && match[0] !== value) {
        return { dateInvalid: true };
      }
    }
    return null;
  }




  profileForm = new FormGroup({
    firstName: new FormControl('', [Validators.required]),
    lastName: new FormControl('', [Validators.required]),
    mail: new FormControl('', [
      Validators.required,
      Validators.pattern('^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$'),
    ]),
    dateOfBirth: new FormControl('', [Validators.required]),
  });
  get firstName() {
    return this.profileForm.get('firstName');
  }
  onSubmit() {
    // TODO: Use EventEmitter with form value
    console.warn(this.profileForm.value);
    this.userservice.save(this.profileForm.value).subscribe((data) => {
      console.log(data);
      alert('SUCCESS!! Bien Enregister :-)\n\n');
    });

  }
}
