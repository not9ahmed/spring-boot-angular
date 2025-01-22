import { Component } from '@angular/core';
// import { RouterOutlet } from '@angular/router';
import { ProductsListComponent } from "./component/products-list/products-list.component";

@Component({
  selector: 'app-root',
  imports: [ProductsListComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'rxjs-products-app';
}
