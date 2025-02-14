package com.example.model;

import com.example.dao.StudentDAO;
import com.example.model.Student;

public class Driver {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();

        Student student1 = new Student("Alice");
        studentDAO.saveStudent(student1);

        Student student2 = new Student("Bob");
        studentDAO.saveStudent(student2);

        System.out.println("Students inserted successfully!");
    }
}
