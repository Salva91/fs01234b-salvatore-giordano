import { Injectable } from '@angular/core';
import { Post } from './models/post';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  getAllPost(): Promise<Post[]> {
    return fetch('../assets/db.json')
      .then(res => res.json())
      .then((res: Post[]) => res);
  }

  getActivePost():Promise<Post[]>{
    return this.getAllPost()
    .then(res => res.filter(p => p.active))
  }

  getInactivePizza():Promise<Post[]>{
    return this.getAllPost()
    .then(res => res.filter(p => !p.active))
  }
}
