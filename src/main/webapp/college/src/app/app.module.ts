import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HttpClientModule } from  '@angular/common/http';
import {StudentService} from './student.service';
import { HomeComponent } from './home/home.component';
import { StudentDetailsComponent } from './student-details/student-details.component';
import {FormsModule} from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ChildfooterComponent } from './childfooter/childfooter.component';
import { SignupComponent } from './signup/signup.component';
import { LoginComponent } from './login/login.component';
import { StudentloginComponent } from './studentlogin/studentlogin.component';
import { TeacherloginComponent } from './teacherlogin/teacherlogin.component';
import { TeacherDetailsComponent } from './teacher-details/teacher-details.component';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
// import { RouterModule } from '@angular/router';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    StudentDetailsComponent,
    HeaderComponent,
    FooterComponent,
    ChildfooterComponent,
    SignupComponent,
    LoginComponent,
    StudentloginComponent,
    TeacherloginComponent,
    TeacherDetailsComponent
//     RouterModule

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    NoopAnimationsModule,
    MatFormFieldModule,
            MatInputModule
  ],
  providers: [StudentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
