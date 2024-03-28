import { Component } from '@angular/core';
import { ServiceService } from '../../service/service.service';
import { Ifoto } from '../../modules/ifoto';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {
  ArrayFoto:Ifoto[] = []
  constructor(private fotoSvc:ServiceService){}

    ngOnInit(){
      this.fotoSvc.getAllFoto().subscribe(p => {

      this.ArrayFoto

      })
    }


}
