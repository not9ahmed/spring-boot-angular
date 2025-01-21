import { Component } from '@angular/core';
import { TodoService } from '../../services/todo.service';
import { Todo } from '../../models/todo';

@Component({
  selector: 'app-list-todo',
  imports: [],
  templateUrl: './list-todo.component.html',
  styleUrl: './list-todo.component.css'
})
export class ListTodoComponent {

  todoItems: Todo[] = [];

  constructor(private todoService: TodoService) {
    this.todoItems = todoService.getTodoItems();
  }


  handleDelete(index: number) {
    this.todoService.removeItem(index);
  }


  handleStatusChange(index: number, status: boolean) {
    const newStatus = !status;
    this.todoService.changeStatus(index, newStatus);
  }

}
