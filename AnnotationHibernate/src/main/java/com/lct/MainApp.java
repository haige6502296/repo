package com.lct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainApp {
  public static void main(String[] args) {
    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory sessionFactory = cfg.buildSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();

    Employee employee = new Employee();
    employee.setFirstName("John");
    employee.setLastName("Smith");
    Employee employee1 = new Employee();
    employee1.setFirstName("John");
    employee1.setLastName("Adanth");

    session.save(employee);
    session.save(employee1);
    transaction.commit();
    session.close();
  }
}