import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from './home/home.component';
import {SignupComponent} from './signup/signup.component';
import { StudentloginComponent } from './studentlogin/studentlogin.component';
import { TeacherloginComponent } from './teacherlogin/teacherlogin.component';
import{StudentDetailsComponent} from './student-details/student-details.component';
// import{ TeacherDetailsComponent} from '.teacher-details/teacher-details.component';
import { TeacherDetailsComponent } from './teacher-details/teacher-details.component';
const routes: Routes = [
                 { path: 'home', component: HomeComponent },
                 { path: 'details', component: StudentDetailsComponent },
                 {path: '', component: HomeComponent},
                 {path: 'signup', component: SignupComponent},
                 {path: 'studentlogin', component: StudentloginComponent},
                 {path: 'teacherlogin', component: TeacherloginComponent},
                 {path: 'teacherDetails', component: TeacherDetailsComponent},
                 {path: '**', component: HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
