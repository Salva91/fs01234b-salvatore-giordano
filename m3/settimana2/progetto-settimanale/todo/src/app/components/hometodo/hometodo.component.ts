import { Component } from '@angular/core';
import { Todo } from '../../modules/todo';
import { TodoServiceService } from '../../service/todo-service.service';
import { UsersServiceService } from '../../service/users-service.service';
import { Users } from '../../modules/users';

@Component({
  selector: 'app-hometodo',
  templateUrl: './hometodo.component.html',
  styleUrls: ['./hometodo.component.scss']
})
export class HometodoComponent {
  todoList: Todo[] = [];
  users: Users[] = [];

  constructor(private todoService: TodoServiceService, private userService: UsersServiceService) {}
  ngOnInit() {
    this.caricaTodo();
  }

  caricaTodo() {
    this.todoList = this.todoService.ottieniTutto();

  }


  trueOfalse(todo: Todo): void {
    todo.completed = !todo.completed;
  }


}
