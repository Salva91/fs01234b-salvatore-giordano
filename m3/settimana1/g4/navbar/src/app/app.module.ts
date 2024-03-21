import { PostService } from './post.service';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './main-component/header/header.component';

import { PostUnserviceComponent } from './post-unservice/post-unservice.component';
import { PostServiceComponent } from './post-service/post-service.component';




@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,

    PostUnserviceComponent,
    PostServiceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
