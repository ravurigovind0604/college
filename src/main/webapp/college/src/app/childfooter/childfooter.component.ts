import { Component,Input } from '@angular/core';

@Component({
  selector: 'app-childfooter',
  templateUrl: './childfooter.component.html',
  styleUrls: ['./childfooter.component.css']
})
export class ChildfooterComponent {
 @Input() data:any;
 constructor(){}
}
