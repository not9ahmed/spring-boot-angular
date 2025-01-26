import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { TokenService } from './token.service';
import { Login, User } from '../models/user';
import { map } from 'rxjs';
import { environment } from '../../environments/environment.development';



@Injectable({
  providedIn: 'root'
})
export class AuthService {


  apiUrl = environment.baseApiUrl;


  // Service will handle the authentication done by client

  constructor(private http: HttpClient, private tokenService: TokenService) { }


  register(user: User) {
    return this.http.post<any>(`${this.apiUrl}/auth/register`, user);
  }


  login(login: Login) {
    return this.http.post<any>(`${this.apiUrl}/auth/login`, login)
          .pipe(
            map((response) => {
            if(response.token) {
              this.tokenService.setToken(response.token, response.role);
            }
            return response;
          }
        ));
  }

  logout() {
    this.tokenService.removeToken();
  }

}
