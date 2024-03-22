import { Component, OnInit } from '@angular/core';
import { Auto } from '../../../models/auto';
import { ServiceService } from '../../../service.service';

@Component({
  selector: 'app-ford',
  templateUrl: './ford.component.html',
  styleUrls: ['./ford.component.css']
})
export class FordComponent implements OnInit {

  autoFord: Auto[] = [];

  constructor(private serviceService: ServiceService) { }

  ngOnInit() {
    this.serviceService.ottieniFord().then(autoFord => {
      this.autoFord = autoFord;
    });
  }

}
