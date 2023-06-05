package com.example.college.controller;

import com.example.college.model.Student;
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
   @PostMapping("/createStudent")
   Student addStudent(@RequestBody Student s){
       return studentService.addStudent(s);
   }

   @GetMapping("/createStudent")
    List<Student> showAllStudent() {
       return studentService.showAllStudent();
   }
       @GetMapping("/createStudent/{id}")
               Student showStudent(@PathVariable Long id)
       {
           return studentService.showStudent(id);
       }

   @DeleteMapping("/createStudent")
   void deleteStudent() {
       studentService.deleteAllStudent();
   }
       @DeleteMapping("/createStudent/{id}")
       public void deleteStudent(@PathVariable long id)
       {
           studentService.deleteStudent(id);
       }

@PutMapping("/createStudent/{id}")
    Optional<Student> updateStudent(@PathVariable Long id, @RequestBody Student s)
    {
       return  studentService.updateStudent(id,s);
    }
}
