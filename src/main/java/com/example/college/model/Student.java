package com.example.college.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id

    @Column(name = "student_id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

   @Column(name="age")
   private int age;

    @OneToMany( cascade = CascadeType.ALL)
//    @JoinColumn(referencedColumnName = "book_id", name="student_id")
    private List<Book> book = new ArrayList<>();

    @OneToMany( cascade = CascadeType.ALL)
//    @JoinColumn(referencedColumnName = "book_id", name="student_id")
    private List<UserInfo> userInfo = new ArrayList<>();


}