import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TododoneComponent } from './tododone.component';

describe('TododoneComponent', () => {
  let component: TododoneComponent;
  let fixture: ComponentFixture<TododoneComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [TododoneComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(TododoneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
