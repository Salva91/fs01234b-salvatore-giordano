import { Component } from '@angular/core';
import { ServiceService } from '../../service/service.service';
import { Iprodotto } from '../../models/iprodotto';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrl: './products.component.scss'
})
export class ProductsComponent {

  prodotti:Iprodotto[] = []

  constructor(private prodottiSvc:ServiceService){}

  ngOnInit(){

      this.prodottiSvc.getAllProdotti().subscribe(prodotti => {
        this.prodotti = prodotti
      })

  }

}
