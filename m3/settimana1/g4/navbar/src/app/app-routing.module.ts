import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PostUnserviceComponent } from './post-unservice/post-unservice.component';
import { AppComponent } from './app.component';
import { PostService } from './post.service';

const routes: Routes = [
  {
    path:'',
    component: AppComponent
  },
  {
    path:'chi-siamo',
    component: PostService
  },
  {
    path:'contatti',
    component: PostUnserviceComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
