package com.example.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.hibernate.Student;
import com.example.utilities.HibernateUtil;

public class StudentDao {

    public void saveStudent(Student student) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}

