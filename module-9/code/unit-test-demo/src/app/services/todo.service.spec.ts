import { TestBed } from '@angular/core/testing';

import { TodoService } from './todo.service';
import { provideHttpClient } from '@angular/common/http';
import { HttpTestingController, provideHttpClientTesting } from '@angular/common/http/testing';
import { Todo } from '../models/todo';

describe('TodoService', () => {
  let service: TodoService;

  let httpMock: HttpTestingController;

  beforeEach(() => {
    TestBed.configureTestingModule({

      // this service is not aware of the app config providers
      providers: [
        provideHttpClient(),

        // to perform the testing
        provideHttpClientTesting()
      ]
    });
    service = TestBed.inject(TodoService);
    httpMock = TestBed.inject(HttpTestingController)
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });


  it('should fetch todos from the API', () => {

    const mockTodos: Todo[] = [
      {id: 1, title: "Testing Angulat", completed: false},
    ]

    service.getTodos().subscribe((todos) => {

      expect(todos.length).toBe(1);
      expect(todos).toEqual(mockTodos);
    })


    const req = httpMock.expectOne("http://localhost:8080/api/todos");
    expect(req.request.method).toBe('GET');
    req.flush(mockTodos);

  });
});
