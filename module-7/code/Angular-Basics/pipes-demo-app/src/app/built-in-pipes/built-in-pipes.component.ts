import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { SummaryPipe } from '../custom-pipes/summary.pipe';

@Component({
  selector: 'app-built-in-pipes',
  imports: [CommonModule, SummaryPipe],
  templateUrl: './built-in-pipes.component.html',
  styleUrl: './built-in-pipes.component.css'
})
export class BuiltInPipesComponent {
  course = {
    title: "Java Full Stack with Angular",
    description: "Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptatum distinctio mollitia porro, explicabo quibusdam nisi libero esse doloremque soluta? Ipsam, vel culpa. Eius tempore recusandae numquam, rerum sunt ratione labore.",
    numberOfStudents: 4293200,
    rating: 4.103949,
    price: 35921,
    startDate: new Date()
  }
}
