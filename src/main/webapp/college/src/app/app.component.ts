import { Component } from '@angular/core';
import {StudentService} from './student.service';
import {Student} from './student.js';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
studentArray : Student[]=[];
  title = 'college';

}
