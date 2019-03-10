package com.lct;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StoreData {
  public static void main(String[] args) {

    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");

    SessionFactory factory = cfg.buildSessionFactory();
    Session session = factory.openSession();
    Transaction tx = session.beginTransaction();


    Employee e=new Employee("Eruner", 32000d);
    session.save(e);
//   一个session 一次只能处理一条，不然报错
    /*session.save(new Employee("Darun", 480000d));*/
    tx.commit();
    session.close();
    System.out.println("record successfully persisted");
  }
}


