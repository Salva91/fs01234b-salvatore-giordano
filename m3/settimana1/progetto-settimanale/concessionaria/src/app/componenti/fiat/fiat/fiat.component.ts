import { Component, OnInit } from '@angular/core';
import { Auto } from '../../../models/auto';
import { ServiceService } from '../../../service.service';

@Component({
  selector: 'app-fiat',
  templateUrl: './fiat.component.html',
  styleUrls: ['./fiat.component.css']
})
export class FiatComponent implements OnInit {

  autoFiat: Auto[] = [];

  constructor(private serviceService: ServiceService) { }

  ngOnInit() {
    this.serviceService.ottieniFiat().then(autoFiat => {
      this.autoFiat = autoFiat;
    });
  }

}
