import { Injectable } from '@angular/core';
import { JwtHelperService } from '@auth0/angular-jwt';
import { BehaviorSubject, Observable, map, tap } from 'rxjs';
import { IUser } from '../models/i-user';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { environment } from '../environments/environment.development';
import { ILoginDate } from '../models/i-login-date';

type AccessData = {
  accessToken:string,
  user:IUser
}

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {
  jwtHelper:JwtHelperService = new JwtHelperService()

  authSubject= new BehaviorSubject<IUser|null>(null);

  user$ = this.authSubject.asObservable()
  isLoggedIn$ = this.user$.pipe(map(user =>!!user))


  constructor(
    private http:HttpClient,
    private router:Router
    ) {

      this.restoreUser()

    }

registerUrl:string = environment.registerUrl;
loginUrl:string = environment.loginUrl;

register(newUser:Partial<IUser>):Observable<AccessData>{
  return this.http.post<AccessData>(this.registerUrl,newUser)
}

login (loginDate:ILoginDate):Observable<AccessData>{
  return this.http.post<AccessData>(this.loginUrl,loginDate)
  .pipe(tap(data =>{
    this.authSubject.next(data.user) // qui si comunica al subject che l'utente si è loggato
    localStorage.setItem("accessData",JSON.stringify(data))
    this.autoLogout(data.accessToken)
  }))
}

logout(){
this.authSubject.next(null)//comunico al sub che l'utente si è sloggato
localStorage.removeItem("accesData")// cosi cancello i dati dell'utente

this.router.navigate(['/auth/login'])//cosi lo mando in quella pagina
}

autoLogout(jwt:string){
  const expDate = this.jwtHelper.getTokenExpirationDate(jwt) as Date;
  const expMs = expDate.getTime() - new Date().getTime();

  setTimeout(()=>{
    this.logout()
  },expMs)
}

restoreUser(){
  const userJson = localStorage.getItem("acessData")
  if (!userJson) return ;

  const accessData:AccessData = JSON.parse(userJson)
  if (this.jwtHelper.isTokenExpired(accessData.accessToken))return;

  this.authSubject.next(accessData.user)
  this.autoLogout(accessData.accessToken)
}

}
