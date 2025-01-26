import { Component } from '@angular/core';
import { BookService } from '../../services/book.service';
import { Book } from '../../models/book';

@Component({
  selector: 'app-books',
  imports: [],
  templateUrl: './books.component.html',
  styleUrl: './books.component.css'
})
export class BooksComponent {

  books: Book[] = [];

  constructor(private bookService: BookService) {
    this.loadBooks();
  }

  loadBooks() {
    this.bookService.getAllBooks().subscribe(data => {
      this.books = data;
    })
  }
}
