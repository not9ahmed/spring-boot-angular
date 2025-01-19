import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

// This will bind the inputs to variables
// imports: [FormsModule]

@Component({
  selector: 'app-two-way-binding',
  imports: [FormsModule],
  templateUrl: './two-way-binding.component.html',
  styleUrl: './two-way-binding.component.css'
})
export class TwoWayBindingComponent {
  firstName: string = '';
  lastName: string = '';
}
