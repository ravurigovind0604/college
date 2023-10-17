package com.example.college.repo;

import com.example.college.model.Student;
import jakarta.persistence.Column;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

 Optional<Student> findByStudentUsernameAndStudentPassword(String username, String password);
 boolean existsByStudentUsername(String studentUsername);
 @Query(nativeQuery = true, value = "Select student_id,student_name,student_username,student_password,student_age from student ;")
 List<Object[]> randomMethod();

}

