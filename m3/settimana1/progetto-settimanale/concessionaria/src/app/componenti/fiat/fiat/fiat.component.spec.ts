/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { FiatComponent } from './fiat.component';

describe('FiatComponent', () => {
  let component: FiatComponent;
  let fixture: ComponentFixture<FiatComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FiatComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FiatComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
