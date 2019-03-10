package com.lct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
  public static void main(String[] args) {
    //one:
    Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");

    //two
    SessionFactory factory=cfg.buildSessionFactory();
    //three:
    Session session=factory.openSession();
    //four:persisting the object
    session.persist(new Employee(200, "zhangsan", 12000));

    //five:create transaction object
    Transaction transaction=session.beginTransaction();
    try {
      //six:commit transaction
      transaction.commit();
      System.out.println("插入成功!");
    } catch (Exception e) {
      System.out.println("插入失败,id重复!");
    }
    //seven:session close
    session.close();
  }
}



