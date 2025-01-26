import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TodosComponent } from './todos.component';
import { provideHttpClient } from '@angular/common/http';
import { provideHttpClientTesting } from '@angular/common/http/testing';
import { of } from 'rxjs';
import { TodoService } from '../services/todo.service';


class MockTodoService {
  getTodos() {
    return of([
      {id: 1, title: "Angular Testing", completed: false}
    ]);
  }
}



describe('TodosComponent', () => {
  let component: TodosComponent;
  let fixture: ComponentFixture<TodosComponent>;

  let mockService: MockTodoService;

  beforeEach(async () => {

    mockService = new MockTodoService();

    await TestBed.configureTestingModule({
      imports: [TodosComponent],
      providers: [
        provideHttpClient(),
        provideHttpClientTesting(),

        // instead of using the actual service, use the mocked
        {provide: TodoService, useValue: mockService}
      ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TodosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });


  it('should load todos on intialization', () => {

    
    expect(component.todoList.length).toBe(1);
    expect(component.todoList[0].title).toBe("Angular Testing");
  });
});
