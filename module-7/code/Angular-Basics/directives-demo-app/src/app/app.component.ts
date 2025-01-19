import { Component } from '@angular/core';
// import { RouterOutlet } from '@angular/router';
import { StructuralDirectiveComponent } from './structural-directive/structural-directive.component';
import { AttributeDirectivesComponent } from "./attribute-directives/attribute-directives.component";

@Component({
  selector: 'app-root',
  imports: [StructuralDirectiveComponent, AttributeDirectivesComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'directives-demo-app';
}
