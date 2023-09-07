package com.example.college.repo;

import com.example.college.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

 Optional<Student> findByStudentUsernameAndStudentPassword(String username, String password);
 boolean existsByStudentUsername(String studentUsername);
}

