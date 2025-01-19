import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';


type Todo = {
  title: string,
  completed: boolean
}



@Component({
  selector: 'app-todo',
  imports: [FormsModule, CommonModule],
  templateUrl: './todo.component.html',
  styleUrl: './todo.component.css'
})


export class TodoComponent {
  todoItems: Todo[] = [];
  newItem: string = "";

  addTodoItem(): void {
    if(this.newItem) {
      this.todoItems.push({
        title: this.newItem,
        completed: false
      });
      this.newItem = "";
    }
  }

  toggleCompletionStatus(itemIndex: number): void {
    this.todoItems[itemIndex].completed = !this.todoItems[itemIndex].completed
  }
}
