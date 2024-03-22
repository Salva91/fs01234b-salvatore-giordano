import { Injectable } from '@angular/core';
import { Auto } from './models/auto';

@Injectable()
export class ServiceService {

  constructor() { }

  ottieniTutteAuto(): Promise<Auto[]> {
    return fetch("../assets/db.json")
      .then(res => res.json())
      .then((res: Auto[]) => res);
  }
  ottieniFiat():Promise<Auto[]> {
    return this.ottieniTutteAuto()
    .then(res => res.filter(m => m.brand ==="Fiat"))

  }
  ottieniAudi():Promise<Auto[]> {
    return this.ottieniTutteAuto()
    .then(res => res.filter(m => m.brand ==="Audi"))
  }
  ottieniFord():Promise<Auto[]> {
    return this.ottieniTutteAuto()
    .then(res => res.filter(m => m.brand ==="Ford"))
  }


  ottieniMarchi(): Promise<string[]> {
    return this.ottieniTutteAuto()
      .then(res => {
        const brands = new Set<string>();
        res.forEach(auto => brands.add(auto.brand));
        return Array.from(brands);
      });
  }

  ottieniDueAutoPerMarchio(marchio: string): Promise<Auto[]> {
    return this.ottieniTutteAuto()
      .then(res => res.filter(auto => auto.brand === marchio).slice(0, 2));
  }
  coloreBrandVerde():Promise<Auto[]>{
    return this.ottieniTutteAuto()
    .then(res => res.filter(a => a.available))
  }
  coloreBrandRosso():Promise<Auto[]>{
    return this.ottieniTutteAuto()
    .then(res => res.filter(a => !a.available))
  }
}
