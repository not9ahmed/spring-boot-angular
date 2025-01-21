import { Routes } from '@angular/router';
import { ListTodoComponent } from './components/list-todo/list-todo.component';
import { AddTodoComponent } from './components/add-todo/add-todo.component';

export const routes: Routes = [
    {path: '', redirectTo:'/todo', pathMatch:'full'},
    {path: 'todos', component: ListTodoComponent},
    {path: 'todos/add', component: AddTodoComponent},

];
