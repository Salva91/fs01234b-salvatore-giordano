import { Injectable } from '@angular/core';
import { Iuser } from '../modules/iuser';
import { JwtHelperService } from '@auth0/angular-jwt';
import { BehaviorSubject, Observable, map, tap } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { ILoginData } from '../modules/i-login-data';
import { environment } from '../../environments/environment.development';
import { Router } from '@angular/router';
type AccessData = {
  accessToken:string,
  user:Iuser
}

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  Helper:JwtHelperService = new JwtHelperService()

  authSubject = new BehaviorSubject<Iuser|null>(null); //il valore iniziale è null perché l'utente ancora non è loggato

  user$ = this.authSubject.asObservable()
  isLoggedIn$ = this.user$.pipe(
    map(user => !!user),
    tap(user =>  this.syncIsLoggedIn = user)

    )

    constructor(private http:HttpClient,
      private router:Router) {
        this.restoreUser()
      }

    registerUrl:string = environment.registerUrl;
    loginUrl:string = environment.loginUrl;

  syncIsLoggedIn:boolean = false;

  register(newUser:Partial<Iuser>):Observable<AccessData>{
    return this.http.post<AccessData>(this.registerUrl,newUser)
  }

  login(loginData:ILoginData):Observable<AccessData>{
    return this.http.post<AccessData>(this.loginUrl,loginData)
    .pipe(tap(data =>{
      this.authSubject.next(data.user)
      localStorage.setItem("accessData",JSON.stringify(data))
      this.autoLogout(data.accessToken)
    }

      ))

  }

  logout(){
    this.authSubject.next(null)
    localStorage.removeItem("accessData")
    this.router.navigate(["/auth/login"])
  }

  autoLogout(jwt:string){
    const expDate = this.Helper.getTokenExpirationDate(jwt) as Date;
    const expMs = expDate.getTime() - new Date().getTime();

    setTimeout(()=>{
      this.logout()
    },expMs)
  }

  getAccessToken():string{
    const userJson = localStorage.getItem('accessData')
    if(!userJson) return '';

    const accessData:AccessData = JSON.parse(userJson)
    if(this.Helper.isTokenExpired(accessData.accessToken)) return '';

    return accessData.accessToken
  }

  restoreUser(){

    const userJson = localStorage.getItem('accessData')
    if(!userJson) return;

    const accessData:AccessData = JSON.parse(userJson)
    if(this.Helper.isTokenExpired(accessData.accessToken)) return;


    this.authSubject.next(accessData.user)
    this.autoLogout(accessData.accessToken)

  }

}
