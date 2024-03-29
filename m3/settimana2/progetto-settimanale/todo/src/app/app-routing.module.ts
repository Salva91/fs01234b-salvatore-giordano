import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HometodoComponent } from './components/hometodo/hometodo.component';
import { TododoneComponent } from './components/tododone/tododone.component';
import { ByUsersComponent } from './components/by-users/by-users.component';


const routes: Routes = [
{
  path: "",
  component:HometodoComponent,
},
{
  path:"tododone",
  component:TododoneComponent,
},
{
  path:"by-users",
  component:ByUsersComponent,
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
