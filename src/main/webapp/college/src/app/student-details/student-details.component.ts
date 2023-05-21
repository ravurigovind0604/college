import { Component } from '@angular/core';
import {StudentService} from '../student.service';
import {Student} from '../student'
// import { FormGroup , FormBuilder} from '@angular/forms';
@Component({
  selector: 'app-student-details',
  templateUrl: './student-details.component.html',
  styleUrls: ['./student-details.component.css']
})
export class StudentDetailsComponent {
// studentForm: FormGroup;
studentArray:Student[]=[];
// newStudent: Student = new Student();
constructor(private s:StudentService )
{

}
ngOnInit(): void {
    this.getdata();
  }
getdata():void{
this.s.getData().subscribe((data:Student[])=>{
this.studentArray=data;
console.log(data);}
);}
saveData(data:Student)
{this.s.saveData(data).subscribe((response)=>{
console.log(data);
});}
}
