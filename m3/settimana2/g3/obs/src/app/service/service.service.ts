import { Injectable } from '@angular/core';
import { Iprodotto } from '../models/iprodotto';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {



  apiUrl:string = 'https://dummyjson.com/products';

  constructor(private http:HttpClient){}

  getAllProdotti(){
    return this.http.get<[Iprodotto[]]>(this.apiUrl)
  }


}
