import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';
import { AuthService } from '../../services/auth.service';
import { TokenService } from '../../services/token.service';

@Component({
  selector: 'app-login',
  imports: [ReactiveFormsModule, CommonModule, RouterLink],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  myForm = new FormGroup({
    username: new FormControl(''),
    password: new FormControl('')
  });

  errorMessage = '';

  constructor(private authService: AuthService, private tokenService: TokenService, private router: Router ) {

    tokenService.isLoggedIn.subscribe(value => {
      if(value) {
        this.router.navigate(['products'])
      }
    })
  }


  handleSubmit() {
    const {username, password} = this.myForm.value;

    if (username && password) {
      
      this.authService.login({username, password}).subscribe({
        next: (response) => {
          
          // if(response && response.token) {
          //   this.router.navigate(['/products']);
          // }

        },
        error: (error) => {
          this.errorMessage = error.message;
        }
      })



    } else {
      this.errorMessage = "Please check username or password"
    }

  }


}
