import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { TokenService } from './token.service';
import { Product } from '../models/product';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment.development';


@Injectable({
  providedIn: 'root'
})
export class ProductService {

  apiURl = environment.baseApiUrl + '/products'

  constructor(private http: HttpClient, private tokenService: TokenService) { 

  }

  getAllProducts(): Observable<Product[]> {

    let headers = new HttpHeaders();
    headers = headers.set('Content-Type', 'application/json; charset=utf-8');
    headers = headers.set('Authorization', 'Bearer ' + this.tokenService.getToken())


    return this.http.get<Product[]>(`${this.apiURl}`, {headers});
  }
}
