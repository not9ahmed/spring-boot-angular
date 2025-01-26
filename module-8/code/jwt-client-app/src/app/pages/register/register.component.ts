import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { AuthService } from '../../services/auth.service';
import { TokenService } from '../../services/token.service';
import { Router } from '@angular/router';
import { User } from '../../models/user';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-register',
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent {


  constructor(private authService: AuthService, private tokenService: TokenService, private router: Router) {
    tokenService.isLoggedIn.subscribe(value => {
      if(value) {
        this.router.navigate(['/products'])
      }
    })
  }

  myForm = new FormGroup({
    firstName: new FormControl('', [Validators.required]),
    lastName: new FormControl('', [Validators.required]),
    username: new FormControl('', [Validators.required]),
    password: new FormControl('', [Validators.required]),
    role: new FormControl('', Validators.required)
  })


  errorMessage = '';

  get firstName(): FormControl {
    return this.myForm.get('firstName') as FormControl
  }

  get lastName(): FormControl {
    return this.myForm.get('lastName') as FormControl
  }

  get username(): FormControl {
    return this.myForm.get('username') as FormControl
  }

  get password(): FormControl {
    return this.myForm.get('password') as FormControl
  }

  get role(): FormControl {
    return this.myForm.get('role') as FormControl
  }



  handleSubmit() {
    const {firstName, lastName, username, password, role } =  this.myForm.value;

    if( firstName && lastName && username && password && role) {
      const newUser: User = {
        firstName,
        lastName,
        username,
        password,
        role
      }

      this.authService.register(newUser).subscribe({
        next: (response) => {
          
          // get the response from the register endpoint
          if (response && response.id) {
            this.router.navigate(['/login'])
          } else {
            this.errorMessage = "Something went wrong, please resubmit once again";
          }
        },
        error: (error) => {
          this.errorMessage = "Something went wrong, please resubmit once again";
        }
      }
    )
    }
  }

}
