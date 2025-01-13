import { Component } from '@angular/core';
import { WelcomeComponent } from './welcome/welcome.component';
// import { RouterOutlet } from '@angular/router';


// Meta data is the below
@Component({
  selector: 'app-root',
  // imports: [RouterOutlet],
  imports: [WelcomeComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'First App Title';
  message = "Ahmed";
  price = 99;
}
