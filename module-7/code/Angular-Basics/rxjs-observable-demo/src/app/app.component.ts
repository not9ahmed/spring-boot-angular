import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CreationOperatorsComponent } from './creation-operators/creation-operators.component';
import { TransformationOperatorsComponent } from "./transformation-operators/transformation-operators.component";
import { ErrorOperatorsComponent } from "./error-operators/error-operators.component";
import { BehaviorSubjectComponent } from './behavior-subject/behavior-subject.component';

@Component({
  selector: 'app-root',
  imports: [CreationOperatorsComponent, TransformationOperatorsComponent, ErrorOperatorsComponent, BehaviorSubjectComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'rxjs-observable-demo';
}
