package com.example.hibernate;
import com.example.dao.StudentDao;

public class Driver {
    public static void main(String[] args) {
        StudentDao studentDAO = new StudentDao();

        // Insert a student
        Student student1 = new Student("Sanjibani Mishra", 024);
        studentDAO.saveStudent(student1);

        System.out.println("Student data inserted successfully!");
    }
}

