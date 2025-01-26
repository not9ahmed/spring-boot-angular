import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';
import { TokenService } from '../services/token.service';


// Auth guard will check if the user can access the page before rendering it
export const authGuard: CanActivateFn = (route, state) => {

  // since it's arrow function
  // constructor injection cannot be used
  // inject can help with that
  const tokenService = inject(TokenService);

  const router = inject(Router);


  tokenService.isLoggedIn.subscribe((value) => {
    if(!value) {
      router.navigate(['/unauthorized'])
      return false;
    }

    return true;
  })

  const allowedRoles: string[] = route.data['roles'];
  if (!allowedRoles.includes(tokenService.getRole())) {
    router.navigate(['/unauthorized']);
  }


  return true;
};
