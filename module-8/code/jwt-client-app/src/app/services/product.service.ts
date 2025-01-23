import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { TokenService } from './token.service';
import { Product } from '../models/product';
import { Observable } from 'rxjs';

const BASE_API_URL = 'http://localhost:8080/api/products';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient, private tokenService: TokenService) { 

  }

  getAllProducts(): Observable<Product[]> {

    let headers = new HttpHeaders();
    headers = headers.set('Content-Type', 'application/json; charset=utf-8');
    headers = headers.set('Authorization', 'Bearer ' + this.tokenService.getToken())


    return this.http.get<Product[]>(`${BASE_API_URL}`, {headers});
  }
}
