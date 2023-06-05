package com.example.college.service;

import com.example.college.model.Student;
import com.example.college.model.UserInfo;
import com.example.college.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private RestTemplate restTemplate;
    public Student addStudent(Student s)
    {
         return studentRepo.save(s);
    }
   public  List<Student> showAllStudent() {
       return studentRepo.findAll();
   }
    public Student showStudent(Long id)
    {

         Student student= studentRepo.findById(id).get();
        List<UserInfo> userInfo= Collections.singletonList(restTemplate.getForObject("http://localhost:8090/getUser/{id}", UserInfo.class, id));
         student.setUserInfo(userInfo);

         return student;
    }
   public void deleteAllStudent(){
        studentRepo.deleteAll();
    }
    public void deleteStudent(long id)
    {
        studentRepo.deleteById(id);
    }
    public Optional<Student> updateStudent(Long id,Student studentData)
    {
        Optional<Student> d= studentRepo.findById(id);
        Student student = d.get();
        student.setName(studentData.getName());
        student.setUsername(studentData.getUsername());
        student.setPassword(studentData.getPassword());
        student.setAge(studentData.getAge());
        studentRepo.save(student);
        return Optional.of(studentRepo.save(student));
    }
}
