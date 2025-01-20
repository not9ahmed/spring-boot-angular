import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-register-form',
  imports: [CommonModule ,FormsModule],
  templateUrl: './register-form.component.html',
  styleUrl: './register-form.component.css'
})
export class RegisterFormComponent {
  handleSubmit(data: NgForm) {
    console.log(data); 
    console.log(data.value); 
  }
}
