package com.lct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainSaveData {
  public static void main(String[] args) {
    Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory;
    Session session;
    Transaction transaction;

    Employee emp1=new Employee();
    Employee emp2=new Employee();
    Address address=new Address();

    address.setAddressLine("23路");
    address.setCity("成都");
    address.setCountry("四川");
    address.setPincode(635020);
    address.setStatus("UP");

    emp1.setName("阿三");
    emp1.setEmail("Asan@123.net");
    emp1.setAddress(address);
    emp2.setName("瘪三");
    emp2.setEmail("Biesan@126.com");
    emp2.setAddress(address);

    factory=cfg.buildSessionFactory();
    session=factory.openSession();
    transaction=session.beginTransaction();
    session.persist(emp1);
    session.persist(emp2);
    transaction.commit();
    System.out.println("数据已存储！");
    session.close();
  }
}
