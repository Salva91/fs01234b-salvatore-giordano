import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../../../service.service';
import { Auto } from '../../../models/auto';

@Component({
  selector: 'app-audi',
  templateUrl: './audi.component.html',
  styleUrls: ['./audi.component.css']
})
export class AudiComponent implements OnInit {

  autoAudi: Auto[] = [];

  constructor(private serviceService: ServiceService) { }

  ngOnInit() {
    this.serviceService.ottieniFiat().then(autoAudi => {
      this.autoAudi = autoAudi;
    });
  }

}
