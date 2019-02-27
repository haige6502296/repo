package com.lct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
  public static void main(String[] args) {
    //第一步:creating configuration object
    Configuration cfg=new Configuration();
    //populates the data of the configuration file
    cfg.configure("hibernate.cfg.xml");

    //第二步:creating session factory object
    SessionFactory factory=cfg.buildSessionFactory();

    //第三步:creating session object
    Session session=factory.openSession();

    //第四步:creating transaction object
    Transaction transaction=session.beginTransaction();

    Employee employee=new Employee();
    employee.setId(4);
    employee.setName("JoeHill");
    employee.setSalary(56000);

    //第五步:persisting the object
    session.persist(employee);

    //第六步:transaction is commited
    try {
      transaction.commit();
      System.out.println("Data is saved successfully!");
    } catch (Exception e) {
      System.out.println("id重复!");
      transaction.rollback();
    }

    //第七步:close session
    session.close();

  }
}