package com.example.college.service;

import com.example.college.config.UsernameAlreadyExistsException;
import com.example.college.model.*;

import com.example.college.repo.ClassRoomRepo;
import com.example.college.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private ClassRoomRepo classRoomRepo;

    public ClassRoom getClassRoomById(int classRoomId) {
        return classRoomRepo.findById(classRoomId).orElse(null);
    }
    public Student addStudent(AddStudentResponse s)
    {


        if(studentRepo.existsByStudentUsername(s.getStudentUsername()))
        {
            throw new UsernameAlreadyExistsException("Username is already taken");
        }
     Student student=new Student();
        student.setStudentName(s.getStudentName());
        student.setStudentUsername(s.getStudentUsername());
        student.setStudentPassword(s.getStudentPassword());
        student.setStudentAge(s.getStudentAge());

        ClassRoom classRoom = getClassRoomById(s.getClassRoomId());
        student.setClassRoom(classRoom);

        return studentRepo.save(student);
    }



    public long showStudentByUsernameAndPassword(String username, String password)
    {


        Optional<Student> s = (studentRepo.findByStudentUsernameAndStudentPassword(username, password));
               long l=s.get().getStudentId();
        return l;
    }

    public void deleteStudent(int id)
    {
        studentRepo.deleteById(id);
    }
    public StudentAndClassRoomDTO getAllStudentsWithClassroomDetails(int id) {
        Optional<Student> student = studentRepo.findById(id); // Or your retrieval logic



            StudentAndClassRoomDTO studentAndClassRoomDTO = new StudentAndClassRoomDTO();
            studentAndClassRoomDTO.setStudentId(student.get().getStudentId());
            studentAndClassRoomDTO.setStudentName(student.get().getStudentName());
            studentAndClassRoomDTO.setStudentUsername(student.get().getStudentUsername());
            studentAndClassRoomDTO.setStudentPassword(student.get().getStudentPassword());
            studentAndClassRoomDTO.setStudentAge(student.get().getStudentAge());

            Optional<ClassRoom> classRoom= classRoomRepo.findById(student.get().getClassRoom().getClassId());
            ClassRoomDTO classRoomDTO = new ClassRoomDTO();
            if (classRoomDTO != null) {
                classRoomDTO.setClassId(classRoom.get().getClassId());
                classRoomDTO.setClassStrength(classRoom.get().getClassStrength());
               classRoomDTO.setClassName(classRoom.get().getClassName());
            }
            studentAndClassRoomDTO.setClassRoomDTO(classRoomDTO);
        return studentAndClassRoomDTO;
    }
}







