import { Injectable } from '@angular/core';

@Injectable(
  {
  providedIn: 'root'
}
)
export class CalculateService {

  private result: number = 0;

  constructor() { }

  totalCost(price: number, quantity: number): number {
    this.result = price * quantity;
    return this.result;
  }


  // can be used for data sharing
  getResult(): number {
    return this.result;
  }
}
