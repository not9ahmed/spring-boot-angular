import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-structural-directive',
  imports: [CommonModule],
  templateUrl: './structural-directive.component.html',
  styleUrl: './structural-directive.component.css'
})
export class StructuralDirectiveComponent {
  friends: string[] = ["Ahmed", "Joe", "Steve", "Bob", "Ann"];
  // friends: string[] = [];
  isVisable: boolean = true;
  isAdmin: boolean = false;

  dayOfWeek: number = 1;

  toggleVisibility() : void {
    this.isVisable  = !this.isVisable;
  }
}
