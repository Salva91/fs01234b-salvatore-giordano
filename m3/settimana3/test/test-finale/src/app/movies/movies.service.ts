import { Imovies } from './../modules/imovies';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { environment } from '../../environments/environment.development';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class MoviesService {

  constructor(private http:HttpClient,
    private router:Router) { }
    movieArray:Imovies[] = []

    moviesUrl:string = environment.moviesUrl;

    getAllMovies(): Observable<Imovies[]> {
      return this.http.get<Imovies[]>(environment.moviesUrl);
    }

    }


