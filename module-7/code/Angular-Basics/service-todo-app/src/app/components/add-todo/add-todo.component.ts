import { Component } from '@angular/core';
import { TodoService } from '../../services/todo.service';
import { CommonModule } from '@angular/common';
import { FormsModule, NgForm } from '@angular/forms';
import { Todo } from '../../models/todo';

@Component({
  selector: 'app-add-todo',
  imports: [CommonModule, FormsModule],
  templateUrl: './add-todo.component.html',
  styleUrl: './add-todo.component.css'
})
export class AddTodoComponent {

  constructor(private todoService: TodoService) {

  }

  handleSubmit(data: NgForm) {
    const {title, priority} = data.value;

    if(title) {
      const newItem: Todo = {title, priority, completed: false};
      this.todoService.addTodoItem(newItem);
    }
  }
}
