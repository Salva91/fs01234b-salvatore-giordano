import { Component } from '@angular/core';
import { TodoServiceService } from '../../service/todo-service.service';
import { UsersServiceService } from '../../service/users-service.service';
import { Todo } from '../../modules/todo';

@Component({
  selector: 'app-tododone',
  templateUrl: './tododone.component.html',
  styleUrl: './tododone.component.scss'
})
export class TododoneComponent {
  todoList: Todo[] = [];

  constructor(private todoService: TodoServiceService, private userService: UsersServiceService) {}

ngOnInit(){
  this.mostraCompletati()
}

mostraCompletati(){
  this.todoList = this.todoService.ottieniCompletate()
}
trueOfalse(todo: Todo): void {
  todo.completed = !todo.completed;
}

}
