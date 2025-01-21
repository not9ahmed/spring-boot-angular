import { Injectable } from '@angular/core';
import { Todo } from '../models/todo';

@Injectable({
  providedIn: 'root'
})
export class TodoService {
  private todoList: Todo[] = [];
  constructor() { }

  getTodoItems(): Todo[] {
    return this.todoList;
  }

  addTodoItem(newItem: Todo) {
    this.todoList.push(newItem);
  }

  changeStatus(index: number, status: boolean) {
    this.todoList[index].completed = status;
  }

  removeItem(index: number) {
    this.todoList.splice(index, 1);
  }
}
