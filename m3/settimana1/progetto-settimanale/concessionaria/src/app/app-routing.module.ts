import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './componenti/home/home/home.component';
import { FiatComponent } from './componenti/fiat/fiat/fiat.component';
import { FordComponent } from './componenti/ford/ford/ford.component';
import { AudiComponent } from './componenti/audi/audi/audi.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
},
{
    path: 'fiat',
    component: FiatComponent
},
{
    path: 'ford',
    component: FordComponent
},
{
    path: 'audi',
    component: AudiComponent
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
