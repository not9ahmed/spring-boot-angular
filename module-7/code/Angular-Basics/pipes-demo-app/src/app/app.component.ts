import { Component } from '@angular/core';
// import { RouterOutlet } from '@angular/router';
import { BuiltInPipesComponent } from './built-in-pipes/built-in-pipes.component';

@Component({
  selector: 'app-root',
  imports: [BuiltInPipesComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'pipes-demo-app';
}
