import { Component } from '@angular/core';
import { AuthService } from '../../services/auth.service';
import { Router, RouterLink } from '@angular/router';
import { TokenService } from '../../services/token.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-header',
  imports: [RouterLink, CommonModule],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {


  isLoggedIn = false;

  constructor(private authService: AuthService, private tokenService: TokenService, private router: Router) {
    // tokenService.isLoggedIn.subscribe((value) => {

    // })

  }


  handleLogout() {
    this.authService.logout();
    this.router.navigate(['/login'])
  }

}
