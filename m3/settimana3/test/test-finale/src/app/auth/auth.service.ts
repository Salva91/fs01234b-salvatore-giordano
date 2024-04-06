import { Injectable } from '@angular/core';
import { Iuser } from '../modules/iuser';
import { JwtHelperService } from '@auth0/angular-jwt';
import { BehaviorSubject, map, tap } from 'rxjs';
type AccessData = {
  accessToken:string,
  user:Iuser
}

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  Helper:JwtHelperService = new JwtHelperService()

  authSubject = new BehaviorSubject<Iuser|null>(null);

  user$ = this.authSubject.asObservable()
  isLoggedIn$ = this.user$.pipe(
    map(user => !!user),
    tap(user =>  this.syncIsLoggedIn = user)
    )

  syncIsLoggedIn:boolean = false;

  constructor() { }
}
