import { Component } from '@angular/core';
import { CalculateFormComponent } from './calculate-form/calculate-form.component';
import { DisplayResultComponent } from './display-result/display-result.component';
import { ParentComponent } from './parent/parent.component';

@Component({
  selector: 'app-root',
  imports: [CalculateFormComponent, DisplayResultComponent, ParentComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'di-service-demo';
}
