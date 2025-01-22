import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs';

const API_URL = "https://dummyjson.com/products";

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  
  constructor(private http: HttpClient) { 
    
  }

  getAllProducts() {
    return this.http.get<any>(API_URL).pipe(map(response => response['products']))
  }
}
