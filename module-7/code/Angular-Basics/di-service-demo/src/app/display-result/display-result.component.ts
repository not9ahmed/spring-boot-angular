import { Component } from '@angular/core';
import { CalculateService } from '../services/calculate.service';

@Component({
  selector: 'app-display-result',
  imports: [],
  templateUrl: './display-result.component.html',
  styleUrl: './display-result.component.css'
})
export class DisplayResultComponent {
  totalCost: number = 0;

  constructor(private calculateService: CalculateService) {

  }
  

  // the result from the service will access between other components
  handleClick(): void {
    this.totalCost = this.calculateService.getResult();
  }
}
