package com.example.college.controller;

import com.example.college.model.AddStudentResponse;
import com.example.college.model.Student;
import com.example.college.model.StudentAndClassRoomDTO;
import com.example.college.model.StudentDTO;
import com.example.college.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="*")
public class StudentController {
    @Autowired
    private StudentService studentService;
   @PostMapping("createStudent")
   Student addStudent(@RequestBody AddStudentResponse s){

       return studentService.addStudent(s);
   }


       @GetMapping("/createStudent/{id}")
       StudentAndClassRoomDTO showStudent(@PathVariable int id)
       {
           return studentService.getAllStudentsWithClassroomDetails(id);
       }
       @GetMapping("/showAllStudents")
       List<StudentDTO> s()
       {
           return studentService.s();
       }
    @GetMapping("/login")
    long showStudentByUsernameAndPassword(@RequestParam String username,@RequestParam String password)
    {
        return studentService.showStudentByUsernameAndPassword(username, password);
    }


       @DeleteMapping("/createStudent/{id}")
       public void deleteStudent(@PathVariable int id)
       {
           studentService.deleteStudent(id);
       }


}
