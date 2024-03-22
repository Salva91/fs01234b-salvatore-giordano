import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './componenti/home/home/home.component';
import { NavbarComponent } from './componenti/navbar/navbar/navbar.component';
import { FooterComponent } from './componenti/footer/footer/footer.component';
import { FordComponent } from './componenti/ford/ford/ford.component';
import { AudiComponent } from './componenti/audi/audi/audi.component';
import { FiatComponent } from './componenti/fiat/fiat/fiat.component';
import { ServiceService } from './service.service';




@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    FooterComponent,
    FordComponent,
    AudiComponent,
    FiatComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [
    ServiceService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
