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
  ngOnInit(): void {
    this.todoList = this.todoService.ottieniTutto();
    this.users = this.todoService.ottieniTuttoUsers();
  }

  CondizioneID(todo: Todo): Users[] {
    return this.users.filter(user => user.id === todo.userId);
  }




  trueOfalse(todo: Todo): void {
    todo.completed = !todo.completed;
  }

}
