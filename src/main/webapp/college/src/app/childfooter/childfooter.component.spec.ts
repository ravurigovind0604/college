import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildfooterComponent } from './childfooter.component';

describe('ChildfooterComponent', () => {
  let component: ChildfooterComponent;
  let fixture: ComponentFixture<ChildfooterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ChildfooterComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ChildfooterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
