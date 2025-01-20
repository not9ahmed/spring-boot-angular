import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { AbstractControl, FormArray, FormBuilder, FormControl, FormGroup, ReactiveFormsModule, ValidationErrors, Validators } from '@angular/forms';

@Component({
  selector: 'app-register-form',
  imports: [ReactiveFormsModule, CommonModule],
  templateUrl: './register-form.component.html',
  styleUrl: './register-form.component.css'
})
export class RegisterFormComponent {


  // using form group
  registerForm = new FormGroup({
    firstName: new FormControl('', [Validators.required, Validators.minLength(3)]),
    lastName: new FormControl('', Validators.required),

    phoneNumbers: new FormArray([this.createPhoneNumberControl()]),

    email: new FormControl('', [Validators.required, Validators.email]),
    password: new FormControl('', [Validators.required, Validators.minLength(6), cannotContainSpace]),
    address: new FormGroup({
      street: new FormControl('', [Validators.required]),
      pinCode: new FormControl('', [Validators.required, Validators.pattern(/^[0-9]{6}/)])
    })
  })


  // using form builder
  // registerForm: any;
  // constructor(private fb: FormBuilder) {
  //   this.registerForm = fb.group({
  //     firstName: [''],
  //     lastName: ['']
  //   })
  // }


  get firstName(): FormControl {
    return this.registerForm.get('firstName') as FormControl;
  }

  get lastName(): FormControl {
    return this.registerForm.get('lastName') as FormControl;
  }

  get email(): FormControl {
    return this.registerForm.get('email') as FormControl;
  }

  get password(): FormControl {
    return this.registerForm.get('password') as FormControl;
  }

  get street(): FormControl {
    return this.registerForm.get('address')?.get('street') as FormControl;
  }

  get pinCode(): FormControl {
    return this.registerForm.get('address')?.get('pinCode') as FormControl;
  }


  get phoneNumbers(): FormArray {
    return this.registerForm.get('phoneNumbers') as FormArray;
  }

  createPhoneNumberControl() {
    return new FormControl('', [Validators.required, Validators.pattern(/^[0-9]{10}/)])
  }
  

  addPhoneNumber() {
    this.phoneNumbers.push(new FormControl(''));

  }

  removePhoneNumber(index: number) {
    this.phoneNumbers.removeAt(index);
  }



  handleSubmit() {
    console.log(this.registerForm);
    console.log(this.registerForm.value);
  }
}



// Custom Validation
function cannotContainSpace(control: AbstractControl): ValidationErrors | null {
  const value: string = control.value;

  if(value.indexOf(' ') > 0) {
    return {
      cannotContainSpace: true
    };
  }
  
  return null;
}
