import { Component } from '@angular/core';
import { CalculateService } from '../services/calculate.service';
import { FormsModule, NgForm } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-calculate-form',
  imports: [FormsModule, CommonModule],
  templateUrl: './calculate-form.component.html',
  styleUrl: './calculate-form.component.css'
})
export class CalculateFormComponent {
  totalCost: number = 0;

  // Dependency Injection
  constructor(private calculateService: CalculateService) {
  }

  handleSubmit(data: NgForm) {
    const {price, quantity} = data.value;
    this.totalCost = this.calculateService.totalCost(price, quantity);

    console.log(this.totalCost);
  }
}
