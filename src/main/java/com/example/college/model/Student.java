package com.example.college.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="username")
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="password")
    private String password;

   @Column(name="age")
   private int age;


    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    @OneToMany( cascade = CascadeType.ALL)
//    @JoinColumn(referencedColumnName = "book_id", name="student_id")
    private List<Book> book = new ArrayList<>();



    // Constructors, getters, and setters

    public Student() {
    }

    public Student(String name, int age, String username,String password, List<Book> book) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
        this.book = book;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}