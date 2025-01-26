import { Component } from '@angular/core';
import { AuthService } from '../../services/auth.service';
import { Router, RouterLink, RouterLinkActive } from '@angular/router';
import { TokenService } from '../../services/token.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-header',
  imports: [RouterLink, CommonModule, RouterLinkActive],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {


  userRole = '';
  isLoggedIn = false;


  constructor(private authService: AuthService, private tokenService: TokenService, private router: Router) {
    
    tokenService.isLoggedIn.subscribe((value)=>{
      this.isLoggedIn = value
    })

    tokenService.userRole.subscribe((value)=>{
      this.userRole = value
    })
    
  }


  handleLogout() {
    this.authService.logout();
    this.router.navigate(['/login'])
  }

}
