import { Component } from '@angular/core';
import { Post } from './models/post';
import { JsonContent } from './models/json-content';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'dbangular';

  postArray:Post[] = [];
  postRandom:Post[] = []



  ngOnInit(){
    fetch('../assets/db.json')
    .then(res=> res.json())
    .then((contenutoJson:JsonContent) =>{
      this.postArray = contenutoJson.posts;

      this.randomPosts(5);
    })
  }


  randomPosts(n:number){

    for(let i = 0; i < n; i++){

      let rand = Math.floor(Math.random()*this.postArray.length);
      this.postRandom.push(this.postArray[rand])
    }

  }
}
