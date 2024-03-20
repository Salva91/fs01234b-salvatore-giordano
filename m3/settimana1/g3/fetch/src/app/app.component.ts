import { Component } from '@angular/core';
import { Book } from './models/book';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'fetch';

  booksArr:Book[] = [];

  ngOnInit(){

    fetch('../assets/db.json')
    .then(books => books.json())
    .then((books:Book[]) => this.booksArr = books)

  }




}
