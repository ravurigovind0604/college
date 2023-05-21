package com.example.college.service;

import com.example.college.model.Student;
import com.example.college.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    public Student addStudent(Student s)
    {
         return studentRepo.save(s);
    }
   public  List<Student> showAllStudent() {
       return studentRepo.findAll();
   }
    public Optional<Student> showStudent(Long id)
    {
        return studentRepo.findById(id);
    }
   public void deleteAllStudent(){
        studentRepo.deleteAll();
    }
    public void deleteStudent(long id)
    {
        studentRepo.deleteById(id);
    }
}
