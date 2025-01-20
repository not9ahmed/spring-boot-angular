import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-profile-detail',
  imports: [CommonModule],
  templateUrl: './profile-detail.component.html',
  styleUrl: './profile-detail.component.css'
})
export class ProfileDetailComponent {
  name: string = '';
  picUrl: string = '';

  firstName: string = '';
  lastName: string = '';
  age: number = 0;

  constructor(private route: ActivatedRoute) {
    this.name = route.snapshot.params['name'];
    this.picUrl = `images/${this.name}.jpg`;


    // query params
    this.firstName = route.snapshot.queryParams['firstName'];
    this.lastName = route.snapshot.queryParams['lastName'];
    this.age = route.snapshot.queryParams['age']; 
  }
}
