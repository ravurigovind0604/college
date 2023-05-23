import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Student} from './student';
@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http: HttpClient) {
   }
   public getData(): Observable<any> {
       return this.http.get<any>(`https://govind-first-project.uc.r.appspot.com/createStudent`);
     }
     public saveData(student:Student):Observable<any>{
     const hdrs =new HttpHeaders({
     'Content-Type':'application/json',
     'Access-Control-Allow-Origin':'*'});
     let httpOptions={headers:hdrs};
     return this.http.post<any>(`https://govind-first-project.uc.r.appspot.com/createStudent`,student,httpOptions)}
}
