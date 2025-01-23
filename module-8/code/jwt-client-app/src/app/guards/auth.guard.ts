import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';
import { TokenService } from '../services/token.service';

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


  return true;
};
