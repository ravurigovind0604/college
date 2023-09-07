import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Student} from './student';
import {Teacher} from './teacher';
import {Attendance} from './attendance';
@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http: HttpClient) {
   }
   public getData(): Observable<any> {
       return this.http.get<any>(`http://localhost:8080/createStudent`);
     }
     public saveData(student:Student):Observable<any>{
     const hdrs =new HttpHeaders({
     'Content-Type':'application/json',
     'Access-Control-Allow-Origin':'*'});
     let httpOptions={headers:hdrs};

    return this.http.post<any>(`http://localhost:8080/createStudent`,student,httpOptions);}

//      deleteData(id:number):Observable<any>
//      {
//      const url = `http://localhost:8080/createStudent/${id}`;
//        return this.http.delete<any>(url);
//
//       }
       deleteData(id:number):Observable<any>
           {
           const url = `http://localhost:8080/createStudent/${id}`;
             return this.http.delete<any>(url);

            }

            private baseUrl = 'http://localhost:8080';
              login(username: string, password: string): Observable<any> {
                                     const url = `${this.baseUrl}/login?username=${username}&password=${password}`;
                                     return this.http.get(url);

//                 this.router.navigate(['/details']);
              }
       teacherLogin(username: string, password: string): Observable<any> {
                                            const url = `${this.baseUrl}/teacher/login?username=${username}&password=${password}`;
                                            return this.http.get(url);

       //                 this.router.navigate(['/details']);
                     }

                     public saveAttendance(attendance: Attendance):Observable<any>{
                    const hdrs =new HttpHeaders({
                       'Content-Type':'application/json',
                   'Access-Control-Allow-Origin':'*'});
                        let httpOptions={headers:hdrs};

                 return this.http.post<any>(`http://localhost:8080/saveAttendance`,attendance,httpOptions);}

 updateBulkAttendance(attendanceData: any[]): Observable<any> {
    const url = 'http://localhost:8080/updateBulkAttendance'; // Replace with your backend endpoint URL
    return this.http.post(url, attendanceData);
  }

}
