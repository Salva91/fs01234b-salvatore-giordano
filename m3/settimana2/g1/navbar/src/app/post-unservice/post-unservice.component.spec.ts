import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PostUnserviceComponent } from './post-unservice.component';

describe('PostUnserviceComponent', () => {
  let component: PostUnserviceComponent;
  let fixture: ComponentFixture<PostUnserviceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [PostUnserviceComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PostUnserviceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
