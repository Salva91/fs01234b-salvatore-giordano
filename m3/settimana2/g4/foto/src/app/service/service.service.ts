import { Injectable } from '@angular/core';
import { Ifoto } from '../modules/ifoto';
import { HttpClient } from '@angular/common/http';
import { Subject } from 'rxjs/internal/Subject';
import { filter, map } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  apiUrl:string = 'https://jsonplaceholder.typicode.com/photos';

  arrayFoto:Ifoto[] = [];

  fotoSubject = new Subject<Ifoto[]>();
  $foto= this.fotoSubject.asObservable()

  constructor(private http:HttpClient){
      this.getAllFoto().subscribe()
  }

  getAllFoto(){
    return this.http.get<Ifoto[]>(this.apiUrl)

  }
}
