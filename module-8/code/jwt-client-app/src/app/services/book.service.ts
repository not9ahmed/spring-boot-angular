import { Injectable } from '@angular/core';
import { Book } from '../models/book';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { TokenService } from './token.service';

@Injectable({
  providedIn: 'root'
})
export class BookService {


  BASE_API_URL = 'http://localhost:8080/api/books';

  constructor(private http: HttpClient, private tokenService: TokenService) { 

  }

  getAllBooks(): Observable<Book[]> {

    let headers = new HttpHeaders();
    headers = headers.set('Content-Type', 'application/json; charset=utf-8');
    headers = headers.set('Authorization', 'Bearer ' + this.tokenService.getToken())


    return this.http.get<Book[]>(`${this.BASE_API_URL}`, {headers});
  }
}
