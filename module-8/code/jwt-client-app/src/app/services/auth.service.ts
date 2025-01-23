import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { TokenService } from './token.service';
import { Login, User } from '../models/user';
import { map } from 'rxjs';


const API_BASE_URL = "http://localhost:8080/api";

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  // Service will handle the authentication done by client

  constructor(private http: HttpClient, private tokenService: TokenService) { }


  register(user: User) {
    return this.http.post<any>(`${API_BASE_URL}/auth/register`, user);
  }


  login(login: Login) {
    return this.http.post<any>(`${API_BASE_URL}/auth/login`, login)
          .pipe(
            map((response) => {
            if(response.token) {
              this.tokenService.setToken(response.token, response.role);
            }
          }
        ));
  }

  logout() {
    this.tokenService.removeToken();
  }

}
