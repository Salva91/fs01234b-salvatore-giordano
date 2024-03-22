import { Component, OnInit } from '@angular/core';
import { Auto } from '../../../models/auto';
import { ServiceService } from '../../../service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  marchi: string[] = [];
  autoPerMarchio: { [key: string]: Auto[] } = {};

  constructor(private serviceService: ServiceService) { }

  ngOnInit() {
    this.serviceService.ottieniMarchi().then(marchi => {
      this.marchi = marchi;
      marchi.forEach(marchio => {
        this.serviceService.ottieniDueAutoPerMarchio(marchio).then(auto => {
          this.autoPerMarchio[marchio] = auto;
        });
      });
    });
  }
}
