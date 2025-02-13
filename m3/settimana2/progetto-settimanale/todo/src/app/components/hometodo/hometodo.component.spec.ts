import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HometodoComponent } from './hometodo.component';

describe('HometodoComponent', () => {
  let component: HometodoComponent;
  let fixture: ComponentFixture<HometodoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [HometodoComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(HometodoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
