import { Component } from '@angular/core';
import { RouterLink, RouterLinkActive } from '@angular/router';


// RouterLink cane be used to navigate to other page
// RouterLinkActive can be find to find if the route is active


@Component({
  selector: 'app-header',
  imports: [RouterLink, RouterLinkActive],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {

}
